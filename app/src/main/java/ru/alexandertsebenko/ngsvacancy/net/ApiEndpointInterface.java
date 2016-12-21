package ru.alexandertsebenko.ngsvacancy.net;

import java.util.List;

import retrofit2.http.Part;
import retrofit2.http.Path;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyMini;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponseForList;
import rx.Observable;

import retrofit2.http.GET;
import ru.alexandertsebenko.ngsvacancy.datamodel.VacancyResponse;

/**
 * Created by avtseben on 18.12.2016.
 */
public interface ApiEndpointInterface {

    String SERVICE_ENDPOINT = "http://rabota.ngs.ru/api/v1/";

    @GET("vacancies")
    Observable<VacancyResponseForList> getVacancies();

    @GET("vacancies/{id}")
    Observable<VacancyResponseForList> getVacancieById(@Path("id") Long id);
}
