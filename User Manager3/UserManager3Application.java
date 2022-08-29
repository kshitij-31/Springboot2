package com.example.UserManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.UserManager.controller"})
public class UserManager3Application {

	public static void main(String[] args) {
		SpringApplication.run(UserManager3Application.class, args);
	}
}