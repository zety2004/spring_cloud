package com.hklk.website.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * springcloudtest
 * 2018/8/20 9:40
 *
 * @author 曹良峰
 * @since
 **/
@FeignClient("eureka.client")
public interface TestFeign {
    @RequestMapping(value = "/clientTest/hello")
    Map<String, Object> doDiscoveryService(@RequestParam(value = "id") String id);
}
