package com.qingguweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiao on 2017/4/19.
 */

public class Now {

    public class More{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

}
