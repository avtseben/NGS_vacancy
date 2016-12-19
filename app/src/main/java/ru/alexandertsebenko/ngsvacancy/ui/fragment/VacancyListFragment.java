package ru.alexandertsebenko.ngsvacancy.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ru.alexandertsebenko.ngsvacancy.R;
import ru.alexandertsebenko.ngsvacancy.datamodel.Vacancy;
import ru.alexandertsebenko.ngsvacancy.net.Client;
import ru.alexandertsebenko.ngsvacancy.ui.VacancyListAdapter;

public class VacancyListFragment  extends Fragment {

    RecyclerView mRecyclerView;
    List mVacancyList;

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
        View view = inflater.inflate(R.layout.fragment_vacancy_list,container, false);
        //Fake data
        mVacancyList = new ArrayList<Vacancy>();
        mVacancyList.add(new Vacancy("PHP-Coder","Студия Артемия Лебедева",100000,120000));
        mVacancyList.add(new Vacancy("Охранник","ИП Волкова",10000,20000));
        mVacancyList.add(new Vacancy("Уборшица","ГУФСИН",10000,12000));
        setUpRecyclerView(view);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.vacancy_list_fragment_menu,menu);
        MenuItem refreshItem = menu.findItem(R.id.refresh_item);
        refreshItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Toast.makeText(getContext(),"refresh clicked",Toast.LENGTH_SHORT).show();
                Client client = new Client();
                client.getVacancies();
                return true;
            }
        });

    }
    private void setUpRecyclerView(View view){
        mRecyclerView = (RecyclerView)view.findViewById(R.id.rv_vacancy_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        VacancyListAdapter adapter = new VacancyListAdapter(mVacancyList);
        mRecyclerView.setAdapter(adapter);
    }
}
