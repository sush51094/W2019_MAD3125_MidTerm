package com.midtermmad3125.Modal;

import java.io.Serializable;

public class city implements Serializable {

    private String cname;
    private String lat;
    private String lon;
    private int countrycode;
    private int population;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public int getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(int countrycode) {
        this.countrycode = countrycode;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "city{" +
                "cname='" + cname + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", countrycode=" + countrycode +
                ", population=" + population +
                '}';
    }

    public city(String cname, String lat, String lon, int countrycode, int population) {
        this.cname = cname;
        this.lat = lat;
        this.lon = lon;
        this.countrycode = countrycode;
        this.population = population;

    }
}
