package com.gxs.springcloud.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GongXings
 * @createTime 31 19:45
 * @description
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.server-url.defaultZone}")
    private String eurekaServers;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){

        System.out.println("applicationName:"+this.applicationName
                +"eurekaServers:"+this.eurekaServers
                +"port:"+this.port);
        return "applicationName:"+this.applicationName
                +"eurekaServers:"+this.eurekaServers
                +"port:"+this.port;
    }
}