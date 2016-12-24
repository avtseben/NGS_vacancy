package ru.alexandertsebenko.ngsvacancy.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.alexandertsebenko.ngsvacancy.R;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyMini;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponseForList;
import ru.alexandertsebenko.ngsvacancy.net.ApiEndpointInterface;
import ru.alexandertsebenko.ngsvacancy.net.ServiceFactory;
import ru.alexandertsebenko.ngsvacancy.ui.adapter.VacancyListAdapter;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class VacancyListFragment extends Fragment {

    public interface OnItemClickListener {
        void onItemClicked(Long id);
    }

    OnItemClickListener listenerItemSelected;
    RecyclerView mRecyclerView;
    List mVacancyList;
    VacancyListAdapter mAdapter;

    public static VacancyListFragment newInstance() {
        VacancyListFragment vlf = new VacancyListFragment();
        return vlf;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vacancy_list, container, false);
        mVacancyList = new ArrayList<VacancyMini>();
        setUpRecyclerView(view);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.vacancy_list_fragment_menu, menu);
        final MenuItem refreshItem = menu.findItem(R.id.refresh_item);
        refreshItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                refreshList();
                return true;
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (listenerItemSelected == null) {
            this.listenerItemSelected = (OnItemClickListener) context;
        }
    }

    private void setUpRecyclerView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_vacancy_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new VacancyListAdapter(mVacancyList);
        mAdapter.setOnItemClickListener(new VacancyListAdapter.OnClickListener() {
            @Override
            public void onItemClick(View itemView, int position) {
                VacancyMini selectedVacancy = (VacancyMini) mVacancyList.get(position);
                listenerItemSelected.onItemClicked(selectedVacancy.getId());
            }
        });
        mRecyclerView.setAdapter(mAdapter);
        refreshList();
    }

    private void refreshList() {
        ApiEndpointInterface service = ServiceFactory
                .createRetrofitService(ApiEndpointInterface.class,
                        ApiEndpointInterface.SERVICE_ENDPOINT);
        service.getVacancies()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<VacancyResponseForList>() {
                    @Override
                    public final void onCompleted() {
                    }

                    @Override
                    public final void onError(Throwable e) {
                        Log.e("NSG_Vacancy", e.getMessage());
                    }

                    @Override
                    public void onNext(VacancyResponseForList vacancyResponse) {
                        mAdapter.dropAllData();
                        for (VacancyMini vacancy : vacancyResponse.getVacancies()) {
                            mAdapter.addData(vacancy);
                        }
                        mAdapter.notifyDataSetChanged();
                    }
                });
    }
}
