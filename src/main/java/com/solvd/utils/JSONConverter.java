package com.solvd.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JSONConverter {
    private Object object;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private List<Object> objectList = new ArrayList<>();
    private String jsonPath = Constants.JSON_PATH;

    public JSONConverter() {

    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void serializeObject(Object obj) throws IOException {
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File(jsonPath), obj);
    }

    public void serializeObjectList(Object... object) throws IOException {
        for (Object obj : object) {
            objectList.add(obj);
        }
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File(jsonPath), objectList);
    }

    public void deserializeObject(Class className) throws IOException {
        objectMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        Object obj = objectMapper.readValue(new File(jsonPath), className);
    }
}
