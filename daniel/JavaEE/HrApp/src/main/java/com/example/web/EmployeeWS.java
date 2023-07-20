package com.example.web;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.dao.ConnectionFactory;
import com.example.dao.EmployeeDao;
import com.example.dao.HRException;
import com.example.pojos.Employee;

@Stateless
@WebService(serviceName="employeews")
public class EmployeeWS {
		// all public methods are by default web method
		 
		@WebMethod(operationName="findById")
		public Employee searchEmployee(String id) {
				EmployeeDao dao=ConnectionFactory.get().getConnection();
				Employee e=new Employee();
				try {
					e = dao.findById(id);
				} catch (HRException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return e;
			}
	    
		@WebMethod
		public Employee checking(String name) {
	    	System.out.println("Hello");
				Employee e=new Employee();
				e.setId(1);
				e.setName(name);
				e.setSalary(1200.00);
				e.setDeptId(101);
		return e;
						
		
	    }

}
