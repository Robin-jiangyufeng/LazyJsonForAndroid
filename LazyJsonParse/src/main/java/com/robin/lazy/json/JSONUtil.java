package com.robin.lazy.json;

import android.util.Log;

import com.alibaba.fastjson.JSON;

public class JSONUtil
{
    
    /**
     * JSON对象序列化
     */
    public static String toJSON(Object obj)
    {
        try {
            return JSON.toJSONString(obj);
        }catch (Exception e){
            Log.e(JSONUtil.class.getSimpleName(), String.format("JSON输入输出错误, 错误原因:%s", e.getMessage()),e);
        }
        return null;
    }
    
    /**
     * JSON对象反序列化
     */
    public static <T> T fromJSON(String json, Class<T> clazz)
    {
        try
        {
            return JSON.parseObject(json,clazz);
        }catch (Exception e)
        {
            Log.e(JSONUtil.class.getSimpleName(), String.format("反序列化失败, 错误原因:%s", e.getMessage()),e);
        }
        return null;
    }
}
