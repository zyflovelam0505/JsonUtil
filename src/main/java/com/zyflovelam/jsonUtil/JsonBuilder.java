package com.zyflovelam.jsonUtil;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: JsonBuilder
 * Package: com.zyflovelam
 * <p>
 * Created by Administrator on 2018/5/11.
 *
 * @author by Administrator
 */
public class JsonBuilder {

    private JsonBuilder() {
    }

    private JSONObject jsonObject;

    public static JsonBuilder createJson() {
        return new JsonBuilder();
    }

    public JsonBuilder put(String key, Object value) {
        if (jsonObject == null) {
            jsonObject = new JSONObject();
        }
        this.jsonObject.put(key, value);
        return this;
    }

    public JSONObject done() {
        return this.jsonObject;
    }

    public String string() {
        return this.jsonObject.toJSONString();
    }

    public Map<String, Object> map() {
        Map<String, Object> map = new HashMap<>(jsonObject.size());
        for (String key : this.jsonObject.keySet()) {
            map.put(key, jsonObject.get(key));
        }
        return map;
    }

}
