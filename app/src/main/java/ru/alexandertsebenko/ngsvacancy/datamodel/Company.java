
package ru.alexandertsebenko.ngsvacancy.datamodel;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    @SerializedName("interviews")
    @Expose
    private List<Object> interviews = null;
    @SerializedName("onedays")
    @Expose
    private List<Object> onedays = null;
    @SerializedName("photos")
    @Expose
    private List<Object> photos = null;
    @SerializedName("show_logo")
    @Expose
    private Boolean showLogo;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("validate_state")
    @Expose
    private Integer validateState;

    public Company(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public List<Object> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Object> interviews) {
        this.interviews = interviews;
    }

    public List<Object> getOnedays() {
        return onedays;
    }

    public void setOnedays(List<Object> onedays) {
        this.onedays = onedays;
    }

    public List<Object> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Object> photos) {
        this.photos = photos;
    }

    public Boolean getShowLogo() {
        return showLogo;
    }

    public void setShowLogo(Boolean showLogo) {
        this.showLogo = showLogo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getValidateState() {
        return validateState;
    }

    public void setValidateState(Integer validateState) {
        this.validateState = validateState;
    }

}
