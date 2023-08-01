package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.pojos.Employee;

@Controller
public class HelloController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String greeting(String name, Model m) {
			Employee e=new Employee();
			e.setName(name);
			m.addAttribute("emp",e);
			return "hello";
	}

}
