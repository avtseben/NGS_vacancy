
package ru.alexandertsebenko.ngsvacancy.datamodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("icq")
    @Expose
    private Integer icq;
    @SerializedName("skype")
    @Expose
    private String skype;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("building")
    @Expose
    private String building;
    @SerializedName("room")
    @Expose
    private Object room;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("firstname")
    @Expose
    private Object firstname;
    @SerializedName("lastname")
    @Expose
    private Object lastname;
    @SerializedName("patronymic")
    @Expose
    private Object patronymic;
    @SerializedName("phones")
    @Expose
    private List<Phone> phones = null;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("address_description")
    @Expose
    private String addressDescription;
    @SerializedName("coordinate")
    @Expose
    private Coordinate coordinate;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("subway")
    @Expose
    private Subway subway;
    @SerializedName("district")
    @Expose
    private District district;
    @SerializedName("microdistrict")
    @Expose
    private Object microdistrict;

    public Integer getIcq() {
        return icq;
    }

    public void setIcq(Integer icq) {
        this.icq = icq;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Object getRoom() {
        return room;
    }

    public void setRoom(Object room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getFirstname() {
        return firstname;
    }

    public void setFirstname(Object firstname) {
        this.firstname = firstname;
    }

    public Object getLastname() {
        return lastname;
    }

    public void setLastname(Object lastname) {
        this.lastname = lastname;
    }

    public Object getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(Object patronymic) {
        this.patronymic = patronymic;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddressDescription() {
        return addressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Subway getSubway() {
        return subway;
    }

    public void setSubway(Subway subway) {
        this.subway = subway;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Object getMicrodistrict() {
        return microdistrict;
    }

    public void setMicrodistrict(Object microdistrict) {
        this.microdistrict = microdistrict;
    }

}
