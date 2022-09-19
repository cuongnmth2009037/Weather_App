package com.example.weatherapp;

import java.util.List;
import java.util.Queue;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface WeatherRestApi {
    String SERVE_URL = "https://dark-sky.p.rapidapi.com/";


    @GET("{latitude},{longitude}")
    Call<WeatherForecast> getWeatherData(
            @Path("latitude") String latitude,
            @Path("longitude") String longitude,
            @Query("lang") String lang,
            @Header("X-RapidAPI-Key") String apiKey,
            @Header("X-RapidAPI-Host") String apiHost
    );
}
