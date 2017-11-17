package com.example.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Drake Mills on 10/16/2017.
 */

public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}
