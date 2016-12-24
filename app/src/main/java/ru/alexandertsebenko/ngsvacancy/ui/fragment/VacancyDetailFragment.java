package ru.alexandertsebenko.ngsvacancy.ui.fragment;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import ru.alexandertsebenko.ngsvacancy.R;
import ru.alexandertsebenko.ngsvacancy.datamodel.Vacancy;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponse;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponseForList;
import ru.alexandertsebenko.ngsvacancy.net.ApiEndpointInterface;
import ru.alexandertsebenko.ngsvacancy.net.ServiceFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by avtseben on 22.12.2016.
 */
public class VacancyDetailFragment extends Fragment {

    TextView vacancyHeader;
    TextView salaryFork;
    ImageView comapnyLogo;
    TextView companyAdress;
    TextView vacancyDescription;
    TextView candidRequirements;
    TextView contacts;
    private static final String VACANCY_ID = "vacancyId";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vacancy_detail, container, false);
        vacancyHeader = (TextView) view.findViewById(R.id.vacancy_header);
        salaryFork = (TextView) view.findViewById(R.id.salary_fork);
        comapnyLogo = (ImageView) view.findViewById(R.id.company_logo_header_in_detail);
        companyAdress = (TextView) view.findViewById(R.id.company_address);
        vacancyDescription = (TextView) view.findViewById(R.id.what_todo_description);
        candidRequirements = (TextView) view.findViewById(R.id.candid_requirements);
        contacts = (TextView) view.findViewById(R.id.contact_info);
        return view;
    }

    @TargetApi(Build.VERSION_CODES.N)
    void setUpAllViews(Vacancy vacancy) {
        System.out.println(vacancy.getHeader());
        vacancyHeader.setText(vacancy.getHeader());
        salaryFork.setText(vacancy.getSalaryMin() + " - " + vacancy.getSalaryMax() + " руб.");
        try {
            Picasso.with(getContext())
                    .load(vacancy.getCompany().getLogo().getUrl())
                    .into(comapnyLogo);
        } catch (Exception e) {
            System.out.println(e);
        }
        companyAdress.setText(vacancy.getContact().getAddress());
        vacancyDescription.setText(Html.fromHtml(vacancy.getDescription()));
        candidRequirements.setText(vacancy.getRequirements());
        contacts.setText("Контакты: \n"
                + " email:" + vacancy.getContact().getEmail() + "\n"
                + " телефон: " + vacancy.getContact().getPhones().get(0).getNumber());
    }

    public static VacancyDetailFragment newInstance(Long vacancyId) {
        VacancyDetailFragment vdf = new VacancyDetailFragment();
        Bundle args = new Bundle();
        args.putLong(VACANCY_ID, vacancyId);
        vdf.setArguments(args);
        return vdf;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Long vacancyId = getArguments().getLong(VACANCY_ID);
        final ApiEndpointInterface service = ServiceFactory
                .createRetrofitService(ApiEndpointInterface.class,
                        ApiEndpointInterface.SERVICE_ENDPOINT);
        service.getVacancieById(vacancyId)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<VacancyResponse>() {

                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("NSG_Vacancy", e.getMessage());
                    }

                    @Override
                    public void onNext(VacancyResponse vacancyResponse) {
                        Vacancy vacancy = vacancyResponse.getVacancies().get(0);
                        setUpAllViews(vacancy);
                    }
                });
    }
}
