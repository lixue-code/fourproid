package com.lixue.autoconfigdemo.controller;

import com.lixue.autoconfigdemo.service.IpPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IpPortController {

    @Autowired
    private IpPortService ipPortService;
    @RequestMapping("/getIpPort")
    public String getIpPort(){
        return ipPortService.getIpPortProp();
    }
}
