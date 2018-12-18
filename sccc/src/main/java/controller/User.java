package controller;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by 阳铭 on 2018/10/9.
 */
public class User {

    String name;
    String age;
    private String hello;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
