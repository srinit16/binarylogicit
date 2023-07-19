package com.example.web;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.example.dao.ConnectionFactory;
import com.example.dao.EmployeeDao;
import com.example.dao.HRException;
import com.example.pojos.Employee;

@Stateless
@Path("/service/employee")
public class EmployeeRSService {
			
	    @GET
		@Path("/search/{id}")	
		public Employee searchEmployee(@PathParam("id") String id) {
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
	    
	    @GET
		@Path("/hello/{name}")	
		public Employee checking(@PathParam("name") String name) {
	    	System.out.println("Hello");
				Employee e=new Employee();
				e.setId(1);
				e.setName(name);
				e.setSalary(1200.00);
				e.setDeptId(101);
		return e;
						
		
	    }

}
