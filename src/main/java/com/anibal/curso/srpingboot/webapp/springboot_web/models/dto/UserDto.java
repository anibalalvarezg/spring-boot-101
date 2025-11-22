package com.anibal.curso.srpingboot.webapp.springboot_web.models.dto;

import com.anibal.curso.srpingboot.webapp.springboot_web.models.User;

public class UserDto {

    private String title;
    private User user;

    public UserDto(String title, String name, String lastname) {
        this.title = title;
        this.user = new User(name, lastname);
    }

    public UserDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
