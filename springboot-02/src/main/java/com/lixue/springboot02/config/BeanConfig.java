package com.lixue.springboot02.config;

import com.lixue.springboot02.entity.UserByConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过配置类将实体配置成bean
 */
@Configuration
public class BeanConfig {

    @Bean
    public UserByConfig userByConfig(){
        UserByConfig userByConfig = new UserByConfig();
        userByConfig.setPassword("123");
        userByConfig.setUsername("zhangsan");
        return userByConfig;
    }
}
