package com.hklk.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringconfigApplication {

    public static void main(String[] args) {

        System.out.println("springCloud配置中心----start");
        SpringApplication.run(SpringconfigApplication.class, args);
    }
}
