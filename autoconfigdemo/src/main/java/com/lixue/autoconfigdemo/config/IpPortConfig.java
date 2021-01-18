package com.lixue.autoconfigdemo.config;

import com.lixue.autoconfigdemo.bean.IpPortProp;
import com.lixue.autoconfigdemo.service.IpPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//将目标类配置成bean，并且注入全局配置文件的属性值
@EnableConfigurationProperties(IpPortProp.class)
//条件过滤，web应用下该配置类才起作用
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
//当目标类存在时配置类才起作用
@ConditionalOnClass(IpPortService.class)
public class IpPortConfig {
    @Autowired
    private IpPortProp ipPortProp;
    @Bean
    //IOC容器中没有该实例时此配置才起作用
    @ConditionalOnMissingBean
    public IpPortService ipPortService(){
        return new IpPortService(ipPortProp);
    }
}
