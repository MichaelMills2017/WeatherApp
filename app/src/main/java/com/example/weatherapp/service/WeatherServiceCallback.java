package com.example.weatherapp.service;

import com.example.weatherapp.data.Channel;

/**
 * Created by Drake Mills on 10/17/2017.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}