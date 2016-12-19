
package ru.alexandertsebenko.ngsvacancy.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VacancyMini {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("add_date")
    @Expose
    private transient String addDate;
    @SerializedName("owner_id")
    @Expose
    private transient Integer ownerId;
    @SerializedName("header")
    @Expose
    private String header;
    @SerializedName("state")
    @Expose
    private transient Integer state;
    @SerializedName("validate_state")
    @Expose
    private transient Integer validateState;
    @SerializedName("visibility_type")
    @Expose
    private transient String visibilityType;
    @SerializedName("removal")
    @Expose
    private transient Boolean removal;
    @SerializedName("site_id")
    @Expose
    private transient Integer siteId;
    @SerializedName("bonus")
    @Expose
    private transient Integer bonus;
    @SerializedName("salary_min")
    @Expose
    private Integer salaryMin;
    @SerializedName("salary_max")
    @Expose
    private Integer salaryMax;
    @SerializedName("currency")
    @Expose
    private transient Currency currency;
    @SerializedName("education")
    @Expose
    private transient Object education;
    @SerializedName("experience_length")
    @Expose
    private transient ExperienceLength experienceLength;
    @SerializedName("working_type")
    @Expose
    private transient WorkingType workingType;
    @SerializedName("schedule")
    @Expose
    private transient Schedule schedule;
    @SerializedName("publication")
    @Expose
    private transient Publication publication;
    @SerializedName("user_type")
    @Expose
    private transient String userType;
/*    @SerializedName("description")
    @Expose
    private transient String description;*/
    @SerializedName("contact")
    @Expose
    private transient Contact contact;
    @SerializedName("address")
    @Expose
    private transient Object address;
    @SerializedName("payment_type_alias")
    @Expose
    private transient String paymentTypeAlias;
    @SerializedName("payment_type")
    @Expose
    private transient PaymentType paymentType;
    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("mod_date")
    @Expose
    private transient String modDate;
    @SerializedName("views")
    @Expose
    private transient Integer views;
    @SerializedName("is_anonymous")
    @Expose
    private transient Boolean isAnonymous;
    @SerializedName("owner")
    @Expose
    private transient Owner owner;
    @SerializedName("is_moderated")
    @Expose
    private transient Boolean isModerated;
    @SerializedName("imported_via")
    @Expose
    private transient Object importedVia;
    @SerializedName("subways")
    @Expose
    private transient List<Object> subways = null;
    @SerializedName("tags")
    @Expose
    private transient List<Object> tags = null;
    @SerializedName("institutions")
    @Expose
    private transient List<Object> institutions = null;
    @SerializedName("jobs")
    @Expose
    private transient List<Object> jobs = null;
    @SerializedName("show_email")
    @Expose
    private transient Boolean showEmail;
    @SerializedName("show_phone")
    @Expose
    private transient Boolean showPhone;
    @SerializedName("use_messages")
    @Expose
    private transient Boolean useMessages;
    @SerializedName("is_commerce")
    @Expose
    private transient Boolean isCommerce;
    @SerializedName("is_upped")
    @Expose
    private transient Boolean isUpped;
    @SerializedName("is_premium")
    @Expose
    private transient Boolean isPremium;
    @SerializedName("toponyms")
    @Expose
    private transient List<Toponym> toponyms = null;
    @SerializedName("favorite")
    @Expose
    private transient Boolean favorite;
    @SerializedName("hided")
    @Expose
    private transient Boolean hided;
    @SerializedName("url")
    @Expose
    private transient String url;
    @SerializedName("salary_min_rub")
    @Expose
    private transient Integer salaryMinRub;
    @SerializedName("salary_max_rub")
    @Expose
    private transient Integer salaryMaxRub;
    @SerializedName("rubrics")
    @Expose
    private transient List<Rubric> rubrics = null;
    @SerializedName("requirements_short")
    @Expose
    private transient String requirementsShort;
    @SerializedName("requirements")
    @Expose
    private transient String requirements;
    @SerializedName("end_date")
    @Expose
    private transient Object endDate;
    @SerializedName("priority")
    @Expose
    private transient Integer priority;
    @SerializedName("salary")
    @Expose
    private transient String salary;
    @SerializedName("salary_formatted")
    @Expose
    private transient String salaryFormatted;
    @SerializedName("can_accept_replies")
    @Expose
    private transient Boolean canAcceptReplies;

    public VacancyMini(String vacancyTitle, String companyName, Integer salaryMin, Integer salaryMax){
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

/*
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
*/

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
