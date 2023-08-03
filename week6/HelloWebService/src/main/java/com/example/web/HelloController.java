package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.pojos.EmployeeInfo;

import com.service.Message;

//@Controller @ResponseBody
@RestController
@RequestMapping(value="/hr")
public class HelloController {
	@Autowired
	private HrService srv;
	
	
	@PostMapping("employees")
	public Message registerEmployee(@RequestBody EmployeeInfo eif) {
		
		return srv.RegisterEmployee(eif);
		
	}
	

}
