package com.hklk.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {

        System.out.println("springCloud注册中心，监听注册服务------start");
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
