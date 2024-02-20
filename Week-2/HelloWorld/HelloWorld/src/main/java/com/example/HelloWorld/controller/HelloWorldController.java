package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    public String getIndex() {
        return "<h1>Hello, World!!<h1>";
    }
}