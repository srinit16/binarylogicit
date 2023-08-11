package org.va.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController {
		
		@RequestMapping(value="/", method=RequestMethod.GET)
		public String goToHome(String name,Model model) {
			//e=dao.findById(1)
			name="Binary Logic IT";
			model.addAttribute("name",name);
			
			return "home";
			
		}
		
}
