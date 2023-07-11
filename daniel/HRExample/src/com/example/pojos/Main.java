package com.example.pojos;

import java.sql.SQLException;
import java.util.List;
public class Main {
			public static void main(String[] args) {
				
				EmployeeDao dao=new EmployeeBL();
				
				//	empList.forEach(Employee::print);
				//	empList.forEach(e-> e.print());
				try {
				List<Employee> empList=dao.findAll();	
					for(Employee e:empList) {
						e.print();
					}
					
				}catch(SQLException se) {
					System.out.println(se.toString());
					//se.printStackTrace();
					
				}

			}
}
