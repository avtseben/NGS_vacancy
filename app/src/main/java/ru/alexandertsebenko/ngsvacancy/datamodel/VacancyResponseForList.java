
package ru.alexandertsebenko.ngsvacancy.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import ru.alexandertsebenko.ngsvacancy.datamodel.fullthrottle.Metadata;

public class VacancyResponseForList {

    @SerializedName("metadata")
    @Expose
    private transient Metadata metadata;
    @SerializedName("vacancies")
    @Expose
    private List<VacancyMini> vacancies = null;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<VacancyMini> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<VacancyMini> vacancies) {
        this.vacancies = vacancies;
    }

}
