package org.thewalking.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thewalking.entities.Product;
import org.thewalking.service.StockMgmtService;

@RestController
@RequestMapping("/stock")
public class StockMgmtController {
	@Autowired	
	private StockMgmtService sms;
	//@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	@GetMapping("/product/{id}")
	public Product searchProduct(@PathVariable("id") int id) {
				return sms.find(id);
	}
		
}
