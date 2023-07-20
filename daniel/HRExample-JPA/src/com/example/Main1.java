package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.pojos.Employee;

public class Main1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration()
										.configure("com/example/config/hibernate.cfg.xml")
										.buildSessionFactory();
		Session s=sessionFactory.openSession();
		
		Employee e=s.get(Employee.class, 1);
		e.print();
	}

}
