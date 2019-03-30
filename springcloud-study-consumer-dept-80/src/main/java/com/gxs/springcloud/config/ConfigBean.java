package com.gxs.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author GongXings
 * @createTime 30 15:43
 * @description
 */
@Configuration
public class ConfigBean {

    /**
     * 配置RestTemplate
     * 通过RestTemplate调用提供者服务 ，发送rest请求
     * 提供了多种访问http服务的方法，
     * 针对于访问rest服务<strong>客户端</strong>的调用的模板类
     * @return
     */
    @Bean
    public  RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}