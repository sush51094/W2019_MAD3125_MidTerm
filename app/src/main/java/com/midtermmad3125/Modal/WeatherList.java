package com.midtermmad3125.Modal;

import android.text.format.DateFormat;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

public class WeatherList implements Serializable {

    private String dt;
    private int cityTemp;
    private String pressure;
    private String humidity;
    private Weather cityWeather;
    private String speed;
    private String deg;
    private String clouds;
    private String rain;

    public WeatherList(String dt, int cityTemp, String pressure, String humidity, Weather cityWeather, String speed, String deg, String clouds, String rain) {
        this.dt = dt;
        this.cityTemp = cityTemp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.cityWeather = cityWeather;
        this.speed = speed;
        this.deg = deg;
        this.clouds = clouds;
        this.rain = rain;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public int getCityTemp() {
        return cityTemp;
    }

    public void setCityTemp(int cityTemp) {
        this.cityTemp = cityTemp;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Weather getCityWeather() {
        return cityWeather;
    }

    public void setCityWeather(Weather cityWeather) {
        this.cityWeather = cityWeather;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public String getClouds() {
        return clouds;
    }

    public void setClouds(String clouds) {
        this.clouds = clouds;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public static String getDateFromTimeStamp(long time)
    {
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(time * 1000L);
        String date = DateFormat.format("EEEE", cal).toString();
        date += "\n" + DateFormat.format("dd MMM yyyy", cal).toString();
        date += "\n" + DateFormat.format("hh:mm a", cal).toString();
        return date;
    }
}

