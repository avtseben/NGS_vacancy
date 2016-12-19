package ru.alexandertsebenko.ngsvacancy.net;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.alexandertsebenko.ngsvacancy.datamodel.Vacancy;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponse;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponseForList;

/**
 * Created by avtseben on 18.12.2016.
 */
public interface ApiEndpointInterface {

    @GET("vacancies/121956933")
    Call<VacancyResponseForList> getVacancies();
}
