package com.lixue.autoconfigdemo.service;

import com.lixue.autoconfigdemo.bean.HelloProp;

public class HelloService {
    private HelloProp helloProp;

    public HelloService(HelloProp helloProp) {
        this.helloProp = helloProp;
    }

    public String doHello(){
        return helloProp.getProp();
    }
}
