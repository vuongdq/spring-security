package com.vuongdq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "HomePage";
    }
    @GetMapping(value = "/hello")
    public String Hello(){
        return "hello";
    }

}
