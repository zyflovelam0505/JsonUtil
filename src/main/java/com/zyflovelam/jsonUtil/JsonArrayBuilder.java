package com.zyflovelam.jsonUtil;

import com.alibaba.fastjson.JSONArray;

import java.util.List;

/**
 * Project: JsonUtil
 * Package: com.zyflovelam.jsonUtil
 * <p>
 * Created by Administrator on 2018/5/11.
 *
 * @author by Administrator
 */
public class JsonArrayBuilder {
    private JSONArray jsonArray;

    private JsonArrayBuilder() {
    }

    public static JsonArrayBuilder createArray() {
        return new JsonArrayBuilder();
    }

    public JsonArrayBuilder add(Object item) {
        if (jsonArray == null) {
            jsonArray = new JSONArray();
        }
        jsonArray.add(item);
        return this;
    }

    public JSONArray done() {
        return jsonArray;
    }

    public String string() {
        return jsonArray.toJSONString();
    }

    public <T> List<T> list(Class<T> clazz){
        return jsonArray.toJavaList(clazz);
    }
}
