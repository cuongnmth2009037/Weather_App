package com.example.weatherapp;

public class WeatherForecast {
    private String latitude;
    private String longtitude;
    private String timezone;
    private CurrentlyForecast currently;
    private HourlyForecast hourly;
    private DailyForecast daily;


    public WeatherForecast() {
    }

    public WeatherForecast(String latitude, String longtitude, String timezone, CurrentlyForecast currently, HourlyForecast hourly, DailyForecast daily) {
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.timezone = timezone;
        this.currently = currently;
        this.hourly = hourly;
        this.daily = daily;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CurrentlyForecast getCurrently() {
        return currently;
    }

    public void setCurrently(CurrentlyForecast currently) {
        this.currently = currently;
    }

    public HourlyForecast getHourly() {
        return hourly;
    }

    public void setHourly(HourlyForecast hourly) {
        this.hourly = hourly;
    }

    public DailyForecast getDaily() {
        return daily;
    }

    public void setDaily(DailyForecast daily) {
        this.daily = daily;
    }
}
