
package ru.alexandertsebenko.ngsvacancy.datamodel;

import android.content.Intent;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vacancy {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("add_date")
    @Expose
    private String addDate;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("header")
    @Expose
    private String header;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("validate_state")
    @Expose
    private Integer validateState;
    @SerializedName("visibility_type")
    @Expose
    private String visibilityType;
    @SerializedName("removal")
    @Expose
    private Boolean removal;
    @SerializedName("site_id")
    @Expose
    private Integer siteId;
    @SerializedName("bonus")
    @Expose
    private Integer bonus;
    @SerializedName("salary_min")
    @Expose
    private Integer salaryMin;
    @SerializedName("salary_max")
    @Expose
    private Integer salaryMax;
    @SerializedName("currency")
    @Expose
    private Currency currency;
    @SerializedName("education")
    @Expose
    private Object education;
    @SerializedName("experience_length")
    @Expose
    private ExperienceLength experienceLength;
    @SerializedName("working_type")
    @Expose
    private WorkingType workingType;
    @SerializedName("schedule")
    @Expose
    private Schedule schedule;
    @SerializedName("publication")
    @Expose
    private Publication publication;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("contact")
    @Expose
    private Contact contact;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("payment_type_alias")
    @Expose
    private String paymentTypeAlias;
    @SerializedName("payment_type")
    @Expose
    private PaymentType paymentType;
    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("mod_date")
    @Expose
    private String modDate;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("is_anonymous")
    @Expose
    private Boolean isAnonymous;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("is_moderated")
    @Expose
    private Boolean isModerated;
    @SerializedName("imported_via")
    @Expose
    private Object importedVia;
    @SerializedName("subways")
    @Expose
    private List<Object> subways = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("institutions")
    @Expose
    private List<Object> institutions = null;
    @SerializedName("jobs")
    @Expose
    private List<Object> jobs = null;
    @SerializedName("show_email")
    @Expose
    private Boolean showEmail;
    @SerializedName("show_phone")
    @Expose
    private Boolean showPhone;
    @SerializedName("use_messages")
    @Expose
    private Boolean useMessages;
    @SerializedName("is_commerce")
    @Expose
    private Boolean isCommerce;
    @SerializedName("is_upped")
    @Expose
    private Boolean isUpped;
    @SerializedName("is_premium")
    @Expose
    private Boolean isPremium;
    @SerializedName("toponyms")
    @Expose
    private List<Toponym> toponyms = null;
    @SerializedName("favorite")
    @Expose
    private Boolean favorite;
    @SerializedName("hided")
    @Expose
    private Boolean hided;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("salary_min_rub")
    @Expose
    private Integer salaryMinRub;
    @SerializedName("salary_max_rub")
    @Expose
    private Integer salaryMaxRub;
    @SerializedName("rubrics")
    @Expose
    private List<Rubric> rubrics = null;
    @SerializedName("requirements_short")
    @Expose
    private String requirementsShort;
    @SerializedName("requirements")
    @Expose
    private String requirements;
    @SerializedName("end_date")
    @Expose
    private Object endDate;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("salary")
    @Expose
    private String salary;
    @SerializedName("salary_formatted")
    @Expose
    private String salaryFormatted;
    @SerializedName("can_accept_replies")
    @Expose
    private Boolean canAcceptReplies;

    public Vacancy(String vacancyTitle, String companyName, Integer salaryMin, Integer salaryMax){
        this.header = vacancyTitle;
        this.company = new Company(companyName);
        this.salaryMin = salaryMin;
        this.salaryMax = salaryMax;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
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

    public String getVisibilityType() {
        return visibilityType;
    }

    public void setVisibilityType(String visibilityType) {
        this.visibilityType = visibilityType;
    }

    public Boolean getRemoval() {
        return removal;
    }

    public void setRemoval(Boolean removal) {
        this.removal = removal;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(Integer salaryMin) {
        this.salaryMin = salaryMin;
    }

    public Integer getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(Integer salaryMax) {
        this.salaryMax = salaryMax;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Object getEducation() {
        return education;
    }

    public void setEducation(Object education) {
        this.education = education;
    }

    public ExperienceLength getExperienceLength() {
        return experienceLength;
    }

    public void setExperienceLength(ExperienceLength experienceLength) {
        this.experienceLength = experienceLength;
    }

    public WorkingType getWorkingType() {
        return workingType;
    }

    public void setWorkingType(WorkingType workingType) {
        this.workingType = workingType;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public String getPaymentTypeAlias() {
        return paymentTypeAlias;
    }

    public void setPaymentTypeAlias(String paymentTypeAlias) {
        this.paymentTypeAlias = paymentTypeAlias;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getIsModerated() {
        return isModerated;
    }

    public void setIsModerated(Boolean isModerated) {
        this.isModerated = isModerated;
    }

    public Object getImportedVia() {
        return importedVia;
    }

    public void setImportedVia(Object importedVia) {
        this.importedVia = importedVia;
    }

    public List<Object> getSubways() {
        return subways;
    }

    public void setSubways(List<Object> subways) {
        this.subways = subways;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public List<Object> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(List<Object> institutions) {
        this.institutions = institutions;
    }

    public List<Object> getJobs() {
        return jobs;
    }

    public void setJobs(List<Object> jobs) {
        this.jobs = jobs;
    }

    public Boolean getShowEmail() {
        return showEmail;
    }

    public void setShowEmail(Boolean showEmail) {
        this.showEmail = showEmail;
    }

    public Boolean getShowPhone() {
        return showPhone;
    }

    public void setShowPhone(Boolean showPhone) {
        this.showPhone = showPhone;
    }

    public Boolean getUseMessages() {
        return useMessages;
    }

    public void setUseMessages(Boolean useMessages) {
        this.useMessages = useMessages;
    }

    public Boolean getIsCommerce() {
        return isCommerce;
    }

    public void setIsCommerce(Boolean isCommerce) {
        this.isCommerce = isCommerce;
    }

    public Boolean getIsUpped() {
        return isUpped;
    }

    public void setIsUpped(Boolean isUpped) {
        this.isUpped = isUpped;
    }

    public Boolean getIsPremium() {
        return isPremium;
    }

    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    public List<Toponym> getToponyms() {
        return toponyms;
    }

    public void setToponyms(List<Toponym> toponyms) {
        this.toponyms = toponyms;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean getHided() {
        return hided;
    }

    public void setHided(Boolean hided) {
        this.hided = hided;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSalaryMinRub() {
        return salaryMinRub;
    }

    public void setSalaryMinRub(Integer salaryMinRub) {
        this.salaryMinRub = salaryMinRub;
    }

    public Integer getSalaryMaxRub() {
        return salaryMaxRub;
    }

    public void setSalaryMaxRub(Integer salaryMaxRub) {
        this.salaryMaxRub = salaryMaxRub;
    }

    public List<Rubric> getRubrics() {
        return rubrics;
    }

    public void setRubrics(List<Rubric> rubrics) {
        this.rubrics = rubrics;
    }

    public String getRequirementsShort() {
        return requirementsShort;
    }

    public void setRequirementsShort(String requirementsShort) {
        this.requirementsShort = requirementsShort;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalaryFormatted() {
        return salaryFormatted;
    }

    public void setSalaryFormatted(String salaryFormatted) {
        this.salaryFormatted = salaryFormatted;
    }

    public Boolean getCanAcceptReplies() {
        return canAcceptReplies;
    }

    public void setCanAcceptReplies(Boolean canAcceptReplies) {
        this.canAcceptReplies = canAcceptReplies;
    }

}
