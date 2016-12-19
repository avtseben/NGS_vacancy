
package ru.alexandertsebenko.ngsvacancy.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VacancyMini {

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
    @SerializedName("company")
    @Expose
    private CompanyMini company;

/*    public VacancyMini(String vacancyTitle, String companyName, Integer salaryMin, Integer salaryMax){
        this.header = vacancyTitle;
        this.company = new Company(companyName);
        this.salaryMin = salaryMin;
        this.salaryMax = salaryMax;
    }*/

    public VacancyMini(){}

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
    public CompanyMini getCompany() {
        return company;
    }

    public void setCompany(CompanyMini company) {
        this.company = company;
    }


}
