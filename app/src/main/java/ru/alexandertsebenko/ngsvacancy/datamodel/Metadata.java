
package ru.alexandertsebenko.ngsvacancy.datamodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("deprecations")
    @Expose
    private List<Deprecation> deprecations = null;
    @SerializedName("resultset")
    @Expose
    private Resultset resultset;

    public List<Deprecation> getDeprecations() {
        return deprecations;
    }

    public void setDeprecations(List<Deprecation> deprecations) {
        this.deprecations = deprecations;
    }

    public Resultset getResultset() {
        return resultset;
    }

    public void setResultset(Resultset resultset) {
        this.resultset = resultset;
    }

}
