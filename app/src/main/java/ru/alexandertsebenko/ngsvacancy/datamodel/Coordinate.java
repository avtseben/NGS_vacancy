
package ru.alexandertsebenko.ngsvacancy.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coordinate {

    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("lon")
    @Expose
    private Float lon;

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

}