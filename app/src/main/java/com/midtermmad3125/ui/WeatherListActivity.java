package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.midtermmad3125.Modal.Weather;
import com.midtermmad3125.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class WeatherListActivity extends AppCompatActivity {
    private List WeatherList = new ArrayList<>();
    private RecyclerView recycle1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_list);
    }



    public String loadJSONFromAsset() {
        String json;
        try {
            InputStream is = getAssets().open("moscow_weather.json");
            int size = is.available();

            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private void processJSON() {


        String js = loadJSONFromAsset();
        if (js != null) {
            try {
                JSONArray mJSONArray = new JSONArray(js);


                for (int i = 0; i < mJSONArray.length(); i++) {


                    JSONObject mJSONObj = mJSONArray.getJSONObject(i);

                    if (mJSONObj.has("city")) {

                        String city = mJSONObj.getString("city");
                        String longitude = mJSONObj.getString("longitude");
                        String latitude = mJSONObj.getString("latitude");
                        String population = mJSONObj.getString("population");

                    }
                }


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }
}



