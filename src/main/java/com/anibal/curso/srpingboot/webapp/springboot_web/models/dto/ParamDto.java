package com.anibal.curso.srpingboot.webapp.springboot_web.models.dto;

public class ParamDto {

    private String message;

    public ParamDto(String message) {
        this.message = message;
    }

    public ParamDto() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
