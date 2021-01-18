package com.lixue.autoconfigdemo.controller;

import com.lixue.autoconfigdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/test")
    public String test(){
        return helloService.doHello();
    }
}
