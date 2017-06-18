package com.qingguweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiao on 2017/4/19.
 */

/*网络上传输数据时常用XML,JSON*/
/*JSON体积小，传输时省流量，但是语义性差*/
/*用谷歌开源库GSON解析JSON数据*/
/*将和风天气返回数据各个部分定义为实体类*/

public class Basic {

    @SerializedName("city")    /*注解让JSON和Java字段建立映射关系*/
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
