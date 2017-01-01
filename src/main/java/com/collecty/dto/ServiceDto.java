package com.collecty.dto;

import java.util.Objects;

public class ServiceDto {

    String type;
    String message;
    Objects data;

    public ServiceDto(String type, String message) {
        super();
        this.type = type;
        this.message = message;
    }

    public ServiceDto(){
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Objects getData() {
        return data;
    }

    public void setData(Objects data) {
        this.data = data;
    }
}
