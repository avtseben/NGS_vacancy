
package ru.alexandertsebenko.ngsvacancy.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VacancyResponseForList {

    @SerializedName("vacancies")
    @Expose
    private List<VacancyMini> vacancies = null;

    public List<VacancyMini> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<VacancyMini> vacancies) {
        this.vacancies = vacancies;
    }

}
