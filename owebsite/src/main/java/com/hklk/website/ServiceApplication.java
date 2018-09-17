package com.hklk.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@RefreshScope
@MapperScan(basePackages = "com.hklk.website.dao.inter")
public class ServiceApplication {
    public static void main(String[] args) {
        System.out.println("springCloud微服务1-----start");
        SpringApplication.run(ServiceApplication.class, args);
    }
}

