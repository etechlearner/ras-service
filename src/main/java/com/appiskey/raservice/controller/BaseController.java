package com.appiskey.raservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by khawar on 1/30/19.
 */
@RestController
@RequestMapping("/api/ras/v1/test")
public class BaseController {
    @Value("${app.title}")
   private String appName;

    @GetMapping("hello")
    public String hello() {
        String msg = "Welcome To " + appName;
        return msg;
    }

}