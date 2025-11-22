package com.anibal.curso.srpingboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anibal.curso.srpingboot.webapp.springboot_web.models.User;
import com.anibal.curso.srpingboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/detailsRest")
    public UserDto details() {
        UserDto userDto = new UserDto();
        String title = "Hola Mundo Spring Boot - Detalles Usuario";
        User user = new User("Anibal", "Gonzalez");
        userDto.setTitle(title);
        userDto.setUser(user);
        
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        List<User> users = new ArrayList<>();
        users.add(new User("Anibal", "Gonzalez"));
        users.add(new User("John", "Doe"));
        users.add(new User("Jane", "Smith"));

        return users;
    }
}
