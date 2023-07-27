package org.va.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankingController {
		
		@RequestMapping(value="/bank", method=RequestMethod.GET)
		public String goToHome(String name,Model model) {
			//e=dao.findById(1)
			name="Binary Logic IT";
			model.addAttribute("name",name);
			
			return "home";
			
		}
		
}
