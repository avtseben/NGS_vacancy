
package ru.alexandertsebenko.ngsvacancy.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Publication {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("geo_id")
    @Expose
    private Integer geoId;
    @SerializedName("order_id")
    @Expose
    private Integer orderId;
    @SerializedName("vacancy_id")
    @Expose
    private Integer vacancyId;
    @SerializedName("company_id")
    @Expose
    private Integer companyId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("is_free")
    @Expose
    private Boolean isFree;
    @SerializedName("logo_in_list")
    @Expose
    private Boolean logoInList;
    @SerializedName("is_service_finished")
    @Expose
    private Boolean isServiceFinished;
    @SerializedName("live_time")
    @Expose
    private Integer liveTime;
    @SerializedName("expired_at")
    @Expose
    private String expiredAt;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("is_dummy")
    @Expose
    private Boolean isDummy;
    @SerializedName("is_deleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("prolong_data")
    @Expose
    private Object prolongData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGeoId() {
        return geoId;
    }

    public void setGeoId(Integer geoId) {
        this.geoId = geoId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(Integer vacancyId) {
        this.vacancyId = vacancyId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Boolean getLogoInList() {
        return logoInList;
    }

    public void setLogoInList(Boolean logoInList) {
        this.logoInList = logoInList;
    }

    public Boolean getIsServiceFinished() {
        return isServiceFinished;
    }

    public void setIsServiceFinished(Boolean isServiceFinished) {
        this.isServiceFinished = isServiceFinished;
    }

    public Integer getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
    }

    public String getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getIsDummy() {
        return isDummy;
    }

    public void setIsDummy(Boolean isDummy) {
        this.isDummy = isDummy;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Object getProlongData() {
        return prolongData;
    }

    public void setProlongData(Object prolongData) {
        this.prolongData = prolongData;
    }

}
