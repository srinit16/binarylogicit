package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.HelloWorld;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h1=(HelloWorld) context.getBean(HelloWorld.class);
		System.out.println("Hello "+h1.getName());
		//System.out.println("\nAddress\n"+h1.getAdd().toString());
		System.out.println("\nAddress\n"+h1.getAdd());
	}

}
