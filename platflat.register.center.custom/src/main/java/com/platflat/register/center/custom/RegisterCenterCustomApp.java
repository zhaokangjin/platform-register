package com.platflat.register.center.custom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer  
@SpringBootApplication
public class RegisterCenterCustomApp {
	public static void main(String[] args) {
		SpringApplication.run(RegisterCenterCustomApp.class, args);
	}
}