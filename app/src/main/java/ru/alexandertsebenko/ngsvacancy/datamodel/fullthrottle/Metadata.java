
package ru.alexandertsebenko.ngsvacancy.datamodel.fullthrottle;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("query")
    @Expose
    private Query query;
    @SerializedName("deprecations")
    @Expose
    private List<Deprecation> deprecations = null;
    @SerializedName("resultset")
    @Expose
    private Resultset resultset;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

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
