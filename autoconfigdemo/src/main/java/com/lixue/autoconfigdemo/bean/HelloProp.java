package com.lixue.autoconfigdemo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "prop")
public class HelloProp {
    private String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "HelloProp{" +
                "prop='" + prop + '\'' +
                '}';
    }
}
