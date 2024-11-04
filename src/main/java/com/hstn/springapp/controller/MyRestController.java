package com.hstn.springapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Value("${first.text}")
    private String hello;

    @Value("${my.car}")
    private String nameOfCar;

    @Value("${my.city}")
    private String nameOfCity;

    @GetMapping("/carCity")
    public String infoOfMyCarAndCity() {
        return "My car - " + nameOfCar + ".\n" +
                "My city - " + nameOfCity + ".";
    }

    @GetMapping("/")
    public String helloWorld() {
        return hello;
    }
}
