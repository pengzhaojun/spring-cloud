package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 阳铭 on 2018/10/15.
 */
@RestController
public class HelloController {

    @Autowired
    HelloFeign helloFeign;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloFeign.hello(name);
    }

}