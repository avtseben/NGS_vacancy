package ru.alexandertsebenko.ngsvacancy.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.alexandertsebenko.ngsvacancy.R;
import ru.alexandertsebenko.ngsvacancy.ui.fragment.VacancyListFragment;

public class MainActivity extends AppCompatActivity {

    private static final String VACANCY_LIST_FRAGMENT_TAG = "vlft";
    FragmentManager mFragManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragManager = getSupportFragmentManager();
        runVacancyListFragment();
    }
    private void runVacancyListFragment() {
        FragmentTransaction ft = mFragManager.beginTransaction();
        ft.replace(R.id.fl_vacancy_list_fragment_container, VacancyListFragment.newInstance(), VACANCY_LIST_FRAGMENT_TAG);
        ft.addToBackStack(null);
        ft.commit();
    }
}
