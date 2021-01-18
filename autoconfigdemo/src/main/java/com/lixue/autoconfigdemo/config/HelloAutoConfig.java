package com.lixue.autoconfigdemo.config;

import com.lixue.autoconfigdemo.bean.HelloProp;
import com.lixue.autoconfigdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置类
 * 1.创建HelloService对象
 * 2.将HelloProp注入到 HelloService
 */
@Configuration
@EnableConfigurationProperties(HelloProp.class)
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@ConditionalOnClass(HelloService.class)
public class HelloAutoConfig {
    @Autowired
    private HelloProp helloProp;

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){
        return new HelloService(helloProp);
    }
}
