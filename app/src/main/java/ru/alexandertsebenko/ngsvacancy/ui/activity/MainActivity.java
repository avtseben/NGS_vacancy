package ru.alexandertsebenko.ngsvacancy.ui.activity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.alexandertsebenko.ngsvacancy.R;
import ru.alexandertsebenko.ngsvacancy.ui.fragment.VacancyDetailFragment;
import ru.alexandertsebenko.ngsvacancy.ui.fragment.VacancyListFragment;

public class MainActivity extends AppCompatActivity implements
        VacancyListFragment.OnItemClickListener {

    private static final String VACANCY_LIST_FRAGMENT_TAG = "vlft";
    private static final String VACANCY_DETAIL_FRAGMENT_TAG = "vdft";
    private static final String ACTIVITY_STATE = "ACTIVITY_STATE";

    FragmentManager mFragManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragManager = getSupportFragmentManager();
        if (savedInstanceState == null) {
            runVacancyListFragment();
        }
    }

    private void runVacancyListFragment() {
        FragmentTransaction ft = mFragManager.beginTransaction();
        ft.replace(R.id.fl_vacancy_list_fragment_container, VacancyListFragment.newInstance(), VACANCY_LIST_FRAGMENT_TAG);
        ft.addToBackStack(VACANCY_LIST_FRAGMENT_TAG);
        ft.commit();
    }

    /**
     * Вакансия выбрана, переход во фрагментт детальной информации о вакансии
     */
    @Override
    public void onItemClicked(Long vacancyId) {
        FragmentTransaction ft = mFragManager.beginTransaction();
        ft.replace(R.id.fl_vacancy_list_fragment_container, VacancyDetailFragment.newInstance(vacancyId), VACANCY_DETAIL_FRAGMENT_TAG);
        ft.addToBackStack(VACANCY_DETAIL_FRAGMENT_TAG);
        ft.commit();
    }
}
