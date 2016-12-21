package ru.alexandertsebenko.ngsvacancy.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ru.alexandertsebenko.ngsvacancy.R;
import ru.alexandertsebenko.ngsvacancy.datamodel.Vacancy;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyMini;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponseForList;

public class VacancyListAdapter extends RecyclerView.Adapter<VacancyListAdapter.ListViewHolder> {


    public interface OnClickListener {
        void onItemClick(View itemView, int position);
    }

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
        return lvHolder;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

        holder.vacancyTitle.setText(vacancyList.get(position).getHeader());
        holder.companyName.setText(vacancyList.get(position).getCompany().getTitle());
        holder.salary.setText(vacancyList.get(position).getSalaryMin() + " - "
                + vacancyList.get(position).getSalaryMax() );
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
}
