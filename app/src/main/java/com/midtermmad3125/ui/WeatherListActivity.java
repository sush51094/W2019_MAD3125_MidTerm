package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.midtermmad3125.Modal.weather;
import com.midtermmad3125.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class WeatherListActivity extends AppCompatActivity
{
private Array<weather>weatherList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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
            // Log.d("json",js);
            try {
                JSONArray mJSONArray = new JSONArray(js);
                weatherList = new Array<weather>();
                for (int i = 0; i < mJSONArray.length(); i++) {

                    JSONObject mJSONObj = mJSONArray.getJSONObject(i);
                    //  Log.d("mjson", mJSONObj.toString());
                    if (mJSONObj.has("sid")) {
                      //  String id = mJSONObj.getString("sid");
//                        String gender = mJSONObj.getString("gender");
                        //Log.d("mjson_ID", String.valueOf(id));
                        //Log.d("mjson_name", String.valueOf(sname));
                       // Log.d("mjson_gender", String.valueOf(gender));
                       // studentArrayList.add(new Student(String.valueOf(id), String.valueOf(sname), String.valueOf(gender)));

                        //  for (Student str : studentArrayList) {
                        //      System.out.println(str.getSid());
                        //  System.out.println(str.getSname());

                        // }
                        System.out.println("Using Iterator class");
                        System.out.println("-----------------------");
                        Iterator<Student> it = studentArrayList.iterator();
                        while (it.hasNext()) {
                            System.out.println(it.next().getSname());
                        }
                    }


                }
                // s.setStudentArrayList(studentArrayList);
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
    }


}
