package com.hklk.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * springcloudtest
 * 2018/8/16 11:14
 *
 * @author 曹良峰
 * @since
 **/

@Component
@RestController
@RequestMapping("/clientTest")
public class TestOneController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public Map<String, Object> doDiscoveryService(String id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("des", "我是谁");
        return map;
    }

}
