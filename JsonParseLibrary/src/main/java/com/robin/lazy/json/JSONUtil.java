package com.robin.lazy.json;

import com.alibaba.fastjson.JSON;
import com.robin.lazy.logger.LazyLogger;

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
            LazyLogger.e(e, "JSON输入输出错误" + e.getMessage());
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
        	LazyLogger.e(e, String.format("反序列化失败, 错误原因:%s", e.getMessage()));
        }
        return null;
    }
}
