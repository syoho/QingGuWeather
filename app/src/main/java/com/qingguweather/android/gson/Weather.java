package com.qingguweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xiao on 2017/4/19.
 */


/*总实体类引用各个实体类*/
public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
