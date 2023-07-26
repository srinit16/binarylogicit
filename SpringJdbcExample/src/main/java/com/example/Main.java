package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.AccountDao;
import com.example.pojos.Account;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		AccountDao dao=(AccountDao) context.getBean("accountOperation");
		Account acc=dao.find(1);
		System.out.println(acc);

	}

}
