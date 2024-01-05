package com.signzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.signzy", "com.signzy.Config"})
@EnableFeignClients(basePackages = {"com.signzy.Config"})
public class SignzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignzyApplication.class, args);
	}
}
