package ru.alexandertsebenko.ngsvacancy.net;

import android.annotation.TargetApi;
import android.os.Build;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.alexandertsebenko.ngsvacancy.MyApplication;
import ru.alexandertsebenko.ngsvacancy.datamodel.Vacancy;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyMini;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponse;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponseForList;

/**
 * Created by avtseben on 18.12.2016.
 */

    public class Client {

        public static final String BASE_URL = "http://rabota.ngs.ru/api/v1/";
        public static final int NOTIFICATION_ID = 5453;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiEndpointInterface apiService = retrofit.create(ApiEndpointInterface.class);

    public void getVacancies() {
        Call<VacancyResponseForList> call = apiService.getVacancies();
        call.enqueue(new Callback<VacancyResponseForList>() {
            @Override
            public void onResponse(Call<VacancyResponseForList> call, Response<VacancyResponseForList> response) {
                if (response.body() != null) {
                    VacancyResponseForList vacancyResponse = response.body();
/*                    String searchType = vacancyResponse.getMetadata().getQuery().getSearchType();
                    System.out.println(searchType);*/
                    for(VacancyMini vacancy : vacancyResponse.getVacancies()){
                        System.out.println("-------------------");
                        System.out.println("Id: " + vacancy.getId());
                        System.out.println("Header: " + vacancy.getHeader());
                        System.out.println("MinSalary: " + vacancy.getSalaryMin());
                        System.out.println("MaxSalary: " + vacancy.getSalaryMax());
                        System.out.println("Company: " + vacancy.getCompany().getTitle());
                        System.out.println(" ");
                    }
                }
            }


            @Override
            public void onFailure(Call<VacancyResponseForList> call, Throwable t) {
                System.out.println("Fail!!!");
            }

        });
    }
    private void catchListFromCloud(Vacancy vacancy) {
        Toast.makeText(MyApplication.getAppContext(), "Client gets vacancy list: " + vacancy, Toast.LENGTH_SHORT).show();
    }
}
