package com.anibal.curso.srpingboot.webapp.springboot_web.models.dto;

public class ParamMixDto {

    private String message;
    private Integer code;

    public ParamMixDto(String message) {
        this.message = message;
    }

    public ParamMixDto(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public ParamMixDto() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
