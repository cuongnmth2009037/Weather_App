package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    EditText edLong, edLa;
    Button btnSubmit;
    TextView tvSummary2, tvSummary1;
    TextView tvTemperature1, tvTemperature2;
    TextView tvHumidity1, tvHumidity2;
    ProgressBar progress;
    private static final String LANG = "vi";
    private static final String API_KEY = "a14fa83095msh4e61c2f7cc01530p112814jsnaa0c0896cb17";
    private static final String API_HOST = "dark-sky.p.rapidapi.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = findViewById(R.id.btnSubmit);
        edLong = findViewById(R.id.edLongti);
        edLa = findViewById(R.id.edLati);
        tvSummary1 = findViewById(R.id.tvSummary1);
        tvSummary2 = findViewById(R.id.tvSummary2);
        tvTemperature1 = findViewById(R.id.tvTemperature1);
        tvTemperature2 = findViewById(R.id.tvTemperature2);
        tvHumidity1 = findViewById(R.id.tvHumidity1);
        tvHumidity2 = findViewById(R.id.tvHumidity2);
        progress = findViewById(R.id.progress);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress.setVisibility(View.VISIBLE);
                tvSummary1.setVisibility(View.GONE);
                tvSummary2.setVisibility(View.GONE);
                tvTemperature1.setVisibility(View.GONE);
                tvTemperature2.setVisibility(View.GONE);
                tvHumidity1.setVisibility(View.GONE);
                tvHumidity2.setVisibility(View.GONE);
                String longitude = edLong.getText().toString();
                String latitude = edLa.getText().toString();
                getData(longitude, latitude);
            }
        });

    }

    public void getData(String latitude, String longitude){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WeatherRestApi.SERVE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WeatherRestApi weatherRestApi = retrofit.create(WeatherRestApi.class);
        weatherRestApi.getWeatherData(
                latitude,
                longitude,
                LANG,
                API_KEY,
                API_HOST

        ).enqueue(new Callback<WeatherForecast>() {
            @Override
            public void onResponse(Call<WeatherForecast> call, Response<WeatherForecast> response) {
                Log.i("999999999999999999999999999999", response.toString());
                if(response.code() == 200) {
                    progress.setVisibility(View.GONE);
                    WeatherForecast weatherForecast = response.body();
                    tvSummary1.setVisibility(View.VISIBLE);
                    tvSummary2.setVisibility(View.VISIBLE);
                    tvSummary2.setText(weatherForecast.getCurrently().getSummary());
                    tvTemperature1.setVisibility(View.VISIBLE);
                    tvTemperature2.setVisibility(View.VISIBLE);
                    tvTemperature2.setText(weatherForecast.getCurrently().getTemperature());
                    tvHumidity1.setVisibility(View.VISIBLE);
                    tvHumidity2.setVisibility(View.VISIBLE);
                    tvHumidity2.setText(weatherForecast.getCurrently().getHumidity());


                }else {
                    progress.setVisibility(View.GONE);
//                    tvContent.setText("Error bad request");

                }
            }

            @Override
            public void onFailure(Call<WeatherForecast> call, Throwable t) {
                progress.setVisibility(View.GONE);
//                tvContent.setText(t.getMessage());

            }
        });

    }
}