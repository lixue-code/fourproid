package com.lixue.springboot02.controller;

import com.lixue.springboot02.entity.User;
import com.lixue.springboot02.entity.UserByConfig;
import com.lixue.springboot02.entity.UserByEnableConfig;
import com.lixue.springboot02.entity.UserByOutProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//将实体类配置成bean,并且将全局配置文件的内容注入到属性中
@EnableConfigurationProperties(UserByEnableConfig.class)
public class UserController {
    @Autowired
    private User user;
    @Autowired
    private UserByConfig userByConfig;
    @Autowired
    private UserByEnableConfig userByEnableConfig;
    @Autowired
    private UserByOutProperties userByOutProperties;

    @RequestMapping("/getUser")
    public User getUser(){
        return user;
    }

    @RequestMapping("/getUserByConfig")
    public UserByConfig getUserByConfig(){
        return userByConfig;
    }

    @RequestMapping("/getUserByEnableConfig")
    public UserByEnableConfig getUserByEnableConfig(){
        return userByEnableConfig;
    }

    @RequestMapping("/getUserByOutProperties")
    public UserByOutProperties getUserByOutProperties(){
        return userByOutProperties;
    }
}
