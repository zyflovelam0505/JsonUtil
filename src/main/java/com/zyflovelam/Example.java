package com.zyflovelam;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zyflovelam.jsonUtil.JsonArrayBuilder;
import com.zyflovelam.jsonUtil.JsonBuilder;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class Example {
    public static void main(String[] args) {

        //JsonBuilder.java example
        JsonBuilder jsonBuilder = JsonBuilder.createJson()
                .put("key", "value")
                .put("key2", "value2");
        //get jsonObject
        JSONObject jsonObject = jsonBuilder.done();

        //get json string
        String jsonString = jsonBuilder.string();

        //convert to map
        Map<String, Object> map = jsonBuilder.map();

        //JsonArrayBuilder.java example
        JsonArrayBuilder jsonArrayBuilder = JsonArrayBuilder.createArray()
                .add("item1")
                .add("item2");

        //get jsonArray
        JSONArray jsonArray = jsonArrayBuilder.done();

        //get json string
        String jsonArrayString = jsonArrayBuilder.string();

        //convert to list
        List<String> list = jsonArrayBuilder.list(String.class);

    }
}
