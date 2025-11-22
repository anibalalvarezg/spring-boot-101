package com.anibal.curso.srpingboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anibal.curso.srpingboot.webapp.springboot_web.models.User;
import com.anibal.curso.srpingboot.webapp.springboot_web.models.dto.ParamDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/path-variables")
public class PathVariableController {
    @Value("${config.username}")
    private String username;
    
    @Value("${config.listOfValues}")
    private List<String> listOfValues;
    
    @Value("${config.code}")
    private Integer code;

    @Value("#{'${config.listOfValues}'.split(',')}")
    private String[] valueList;
    
    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private String valueString;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    @Value("#{${config.valuesMap}.key1}")
    private String key1;

    @Autowired
    private Environment env;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        ParamDto param = new ParamDto();
        param.setMessage("El valor del path variable es: " + message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mix(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }
    
    @PostMapping("/create")
    public User create(@RequestBody User user) {
        
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message) {
        return Map.of(
            "username", this.username,
            "message", message,
            "listOfValues", this.listOfValues,
            "code", env.getProperty("config.code", Integer.class),
            "valueList", this.valueList,
            "valueString", this.valueString,
            "valuesMap", this.valuesMap,
            "key1", this.key1
        );
    }    
}
