
package ru.alexandertsebenko.ngsvacancy.datamodel;

import ru.alexandertsebenko.ngsvacancy.datamodel.fullthrottle.Metadata;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VacancyResponse {

    @SerializedName("metadata")
    @Expose
    private transient Metadata metadata;
    @SerializedName("vacancies")
    @Expose
    private List<Vacancy> vacancies = null;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }

}
