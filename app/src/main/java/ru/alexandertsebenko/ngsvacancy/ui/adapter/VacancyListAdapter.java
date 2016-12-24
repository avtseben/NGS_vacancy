package ru.alexandertsebenko.ngsvacancy.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ru.alexandertsebenko.ngsvacancy.R;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyMini;
import ru.alexandertsebenko.ngsvacancy.util.MyApplication;

public class VacancyListAdapter extends RecyclerView.Adapter<VacancyListAdapter.ListViewHolder> {

    public interface OnClickListener {
        void onItemClick(View itemView, int position);
    }

    private Context context;
    private OnClickListener listener;
    private List<VacancyMini> vacancyList;

    public void setOnItemClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public VacancyListAdapter(List<VacancyMini> vacancies) {
        vacancyList = vacancies;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_vacancy_item, parent, false);
        ListViewHolder lvHolder = new ListViewHolder(view);
        context = view.getContext();
        return lvHolder;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

        VacancyMini vacancy = vacancyList.get(position);
        holder.vacancyTitle.setText(vacancy.getHeader());
        holder.companyName.setText(vacancy.getCompany().getTitle());
        holder.salary.setText(String.format("%d - %d руб", vacancy.getSalaryMin(), vacancyList.get(position).getSalaryMax()));
        //Setup Company Logo
        try {
            Picasso.with(context)
                    .load(vacancy.getCompany().getLogo().getUrl())
                    .resizeDimen(R.dimen.logo_width, R.dimen.logo_height)
                    .centerCrop()
                    .into(holder.companyLogo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public int getItemCount() {
        return vacancyList.size();
    }

    public VacancyMini getListItem(int position) {
        return vacancyList.get(position);
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView companyLogo;
        TextView companyName;
        TextView salary;
        TextView vacancyTitle;

        public ListViewHolder(View itemView) {
            super(itemView);
            companyLogo = (ImageView) itemView.findViewById(R.id.company_logo_header);
            salary = (TextView) itemView.findViewById(R.id.salary_header);
            companyName = (TextView) itemView.findViewById(R.id.company_name_header);
            vacancyTitle = (TextView) itemView.findViewById(R.id.vacancy_header);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (listener != null && position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(view,position);
                        }
                    }
                }
            });
        }
    }
    public void addData(VacancyMini vacancy) {
        vacancyList.add(vacancy);
    }

    public void dropAllData() {
        vacancyList.clear();
    }
}
