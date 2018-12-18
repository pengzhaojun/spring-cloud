package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 阳铭 on 2018/10/14.
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
