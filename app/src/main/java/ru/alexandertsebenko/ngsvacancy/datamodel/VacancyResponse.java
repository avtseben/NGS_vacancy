
package ru.alexandertsebenko.ngsvacancy.datamodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VacancyResponse {

    @SerializedName("vacancies")
    @Expose
    private List<Vacancy> vacancies = null;

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }

}
