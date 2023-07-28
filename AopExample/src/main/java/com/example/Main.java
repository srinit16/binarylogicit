package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.EmployeeService;

public class Main {
		public static void main(String[] args) {
			ApplicationContext ct=new ClassPathXmlApplicationContext("beans.xml");
			EmployeeService es=(EmployeeService) ct.getBean("emps");
			String name=es.getEmp().getName();
			System.out.println(name);
		}
}
