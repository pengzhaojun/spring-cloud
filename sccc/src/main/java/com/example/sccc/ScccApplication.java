package com.example.sccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class ScccApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScccApplication.class, args);
	}
}
