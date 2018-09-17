package com.hklk.zuulroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServicezuulApplication {
    public static void main(String[] args) {
        System.out.println("springCloud路由 ----start");
        SpringApplication.run(ServicezuulApplication.class, args);
    }
}
