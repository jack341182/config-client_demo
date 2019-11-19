package com.example.configclientdemo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${dd.aa}")
    private String dd;

    @GetMapping("/aa")
    public String getDD() {
        System.out.println(dd);
        return dd;
    }
}
