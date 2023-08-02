package com.example.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeDao;
import com.example.pojos.Employee;

//@Controller @ResponseBody
@RestController
public class HelloController {
	@Autowired
	private EmployeeDao dao;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public Employee greeting(int id) {
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

}
