package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 阳铭 on 2018/10/15.
 */
@FeignClient(name = "eureka-producer" , fallback = HelloFeignHystrix.class)
public interface HelloFeign {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
