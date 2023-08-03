package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.EmployeeDao;
import com.example.pojos.Employee;

@Service
public class EmployeeService{
	@Autowired
	private EmployeeDao dao;
	
	public Employee find(int id) {
		Employee e=null;
		Optional<Employee> opt=dao.findById(id);
		if(opt.isPresent()) {
			e=opt.get();
		}else {
			e=new Employee();
			e.setName("Employee Doesnt Exist");
		}
		return e;
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void addEmployee(Employee e) {
				dao.save(e);
	}
}
