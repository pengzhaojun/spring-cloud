package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by 阳铭 on 2018/10/17.
 */
@Component
public class HelloFeignHystrix implements HelloFeign  {

    @Override
    public String hello(String name) {
        return "Hello Hystrix!";
    }

}
