package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication @ComponentScan(value={"com.example, com.service"})
public class HelloWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWebApplication.class, args);
	}

}
