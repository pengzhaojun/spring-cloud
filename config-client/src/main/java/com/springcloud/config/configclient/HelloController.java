package com.springcloud.config.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @Value("${neo.hello}")
    private String hello;
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    @RequestMapping("/hello")
    public String from() {
        return String.format("%s ,myName is %s , %s 岁", hello, name ,age) ;
    }
}