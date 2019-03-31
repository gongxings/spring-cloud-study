package com.gxs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author GongXings
 * @createTime 31 18:07
 * @description
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344App {
    public static void main(String[] args) {
        SpringApplication.run(Config3344App.class,args);
    }
}