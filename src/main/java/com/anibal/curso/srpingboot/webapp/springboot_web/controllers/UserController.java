package com.anibal.curso.srpingboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.anibal.curso.srpingboot.webapp.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model) {
        User user = new User("Anibal", "Gonzalez", "anibal.alvarezg@gmail.com");
        model.put("title", "Hola Mundo Spring Boot");
        model.put("user", user);
        return "details";
    }

    @GetMapping("list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        User user = new User("Anibal", "Gonzalez", "anibalalavrez@mail.cl");
        User user2 = new User("John", "Doe", "johndoe@mail.cl");
        User user3 = new User("Jane", "Smith");
        return Arrays.asList(user, user2, user3);
    }
}
