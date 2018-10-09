package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eooco
 * @Description: TODO
 * @date 2018/10/9 17:23
 */
@RestController
public class HelloController {

    @Value("${name}")
    String name;
    @Value("${age}")
    String age;
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String hello(){
        return String.format("%s  ,my name is %s ,  %s 岁" , hello, name ,age);
    }


}
