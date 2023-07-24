package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.HelloWorld;

public class Main {

	public static void main(String[] args) {
	//	HelloWorld h=new HelloWorld();
	//	h.setName("Nitin");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h1=(HelloWorld) context.getBean("helloworld");
		System.out.println("Hello "+h1.getName());
		h1.setName("Dean");
		HelloWorld h2=(HelloWorld) context.getBean("helloworld");
		System.out.println("Hello "+h2.getName());
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h1==h2);
	}

}
