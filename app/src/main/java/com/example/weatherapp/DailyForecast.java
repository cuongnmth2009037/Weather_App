package com.example.weatherapp;

public class DailyForecast {
    private String summary;
    private String icon;
    private String sunriseTime;
    private String sunsetTime;
    private String moonPhase;
    private String precipIntensity;
    private String precipIntensityMax;
    private String precipIntensityMaxTime;
    private String precipProbability;
    private String precipType;
    private String temperatureHigh;
    private String temperatureHighTime;
    private String apparentTemperatureHigh;
    private String apparentTemperatureHighTime;
    private String apparentTemperatureLow;
    private String apparentTemperatureLowTime;
    private String dewPoint;
    private String humidity;
    private String pressure;
    private String windSpeed;
    private String windGust;
    private String windGustTime;
    private String windBearing;
    private String cloudCover;
    private String uvIndex;
    private String uvIndexTime;
    private String visibility;
    private String ozone;
    private String temperatureMin;
    private String temperatureMinTime;
    private String apparentTemperatureMin;
    private String apparentTemperatureMinTime;
    private String apparentTemperatureMax;
    private String apparentTemperatureMaxTime;


    public DailyForecast() {
    }

    public DailyForecast(String summary, String icon, String sunriseTime, String sunsetTime, String moonPhase, String precipIntensity, String precipIntensityMax, String precipIntensityMaxTime, String precipProbability, String precipType, String temperatureHigh, String temperatureHighTime, String apparentTemperatureHigh, String apparentTemperatureHighTime, String apparentTemperatureLow, String apparentTemperatureLowTime, String dewPoint, String humidity, String pressure, String windSpeed, String windGust, String windGustTime, String windBearing, String cloudCover, String uvIndex, String uvIndexTime, String visibility, String ozone, String temperatureMin, String temperatureMinTime, String apparentTemperatureMin, String apparentTemperatureMinTime, String apparentTemperatureMax, String apparentTemperatureMaxTime) {
        this.summary = summary;
        this.icon = icon;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.moonPhase = moonPhase;
        this.precipIntensity = precipIntensity;
        this.precipIntensityMax = precipIntensityMax;
        this.precipIntensityMaxTime = precipIntensityMaxTime;
        this.precipProbability = precipProbability;
        this.precipType = precipType;
        this.temperatureHigh = temperatureHigh;
        this.temperatureHighTime = temperatureHighTime;
        this.apparentTemperatureHigh = apparentTemperatureHigh;
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
        this.apparentTemperatureLow = apparentTemperatureLow;
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
        this.dewPoint = dewPoint;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windGustTime = windGustTime;
        this.windBearing = windBearing;
        this.cloudCover = cloudCover;
        this.uvIndex = uvIndex;
        this.uvIndexTime = uvIndexTime;
        this.visibility = visibility;
        this.ozone = ozone;
        this.temperatureMin = temperatureMin;
        this.temperatureMinTime = temperatureMinTime;
        this.apparentTemperatureMin = apparentTemperatureMin;
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
        this.apparentTemperatureMax = apparentTemperatureMax;
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(String sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public String getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(String sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public String getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(String precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public String getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    public void setPrecipIntensityMax(String precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    public String getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(String precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    public String getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(String precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public String getTemperatureHigh() {
        return temperatureHigh;
    }

    public void setTemperatureHigh(String temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public String getTemperatureHighTime() {
        return temperatureHighTime;
    }

    public void setTemperatureHighTime(String temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    public String getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(String apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    public String getApparentTemperatureHighTime() {
        return apparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime(String apparentTemperatureHighTime) {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public String getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    public void setApparentTemperatureLow(String apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    public String getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(String apparentTemperatureLowTime) {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    public String getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(String dewPoint) {
        this.dewPoint = dewPoint;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindGust() {
        return windGust;
    }

    public void setWindGust(String windGust) {
        this.windGust = windGust;
    }

    public String getWindGustTime() {
        return windGustTime;
    }

    public void setWindGustTime(String windGustTime) {
        this.windGustTime = windGustTime;
    }

    public String getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(String windBearing) {
        this.windBearing = windBearing;
    }

    public String getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getUvIndexTime() {
        return uvIndexTime;
    }

    public void setUvIndexTime(String uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getOzone() {
        return ozone;
    }

    public void setOzone(String ozone) {
        this.ozone = ozone;
    }

    public String getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(String temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public String getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public void setTemperatureMinTime(String temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    public String getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public void setApparentTemperatureMin(String apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public String getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(String apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public String getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public void setApparentTemperatureMax(String apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    public String getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(String apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }
}

