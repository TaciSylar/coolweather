package com.coolweather.android.gson;

/**
 * Created by sylar on 2017/9/5.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
