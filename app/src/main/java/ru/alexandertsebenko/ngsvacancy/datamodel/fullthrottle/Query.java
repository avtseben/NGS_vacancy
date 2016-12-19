
package ru.alexandertsebenko.ngsvacancy.datamodel.fullthrottle;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("state")
    @Expose
    private List<Integer> state = null;
    @SerializedName("search_type")
    @Expose
    private String searchType;

    public List<Integer> getState() {
        return state;
    }

    public void setState(List<Integer> state) {
        this.state = state;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

}
