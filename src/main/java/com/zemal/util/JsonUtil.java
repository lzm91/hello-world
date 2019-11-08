package com.zemal.util;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Type;

public class JsonUtil {

    public static String object2JsonString(Object obj){
        return JSONObject.toJSONString(obj);
    }

    public static <T> T jsonString2Object(String jsonString, Type type){
        return JSONObject.parseObject(jsonString, type);
    }


}
