
package ru.alexandertsebenko.ngsvacancy.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vacancy {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("header")
    @Expose
    private String header;
    @SerializedName("salary_min")
    @Expose
    private Integer salaryMin;
    @SerializedName("salary_max")
    @Expose
    private Integer salaryMax;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("contact")
    @Expose
    private Contact contact;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("company")
    @Expose
    private Company company;
    private Integer salaryMinRub;
    @SerializedName("salary_max_rub")
    @Expose
    private Integer salaryMaxRub;
    @SerializedName("requirements")
    @Expose
    private String requirements;

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

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
}
