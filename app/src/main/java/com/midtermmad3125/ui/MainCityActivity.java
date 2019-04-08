package com.midtermmad3125.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.midtermmad3125.R;

public class MainCityActivity extends AppCompatActivity
{
    private TextView cname;
    private TextView latitude;
    private TextView longitude;
    private TextView countrycode;
    private TextView population;
    private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cname = findViewById(R.id.cname);
        latitude = findViewById(R.id.lat);
        longitude = findViewById(R.id.lat);
        countrycode = findViewById(R.id.lon);
        population = findViewById(R.id.population);
        Next = findViewById(R.id.btnNext);

Next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainCityActivity.this,WeatherListActivity.class);
        startActivity(intent);


    }
});






    }
}
