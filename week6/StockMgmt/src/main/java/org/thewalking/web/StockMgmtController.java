package org.thewalking.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thewalking.entities.Product;
import org.thewalking.service.StockMgmtService;
import org.thewalking.util.Message;

@RestController
@RequestMapping("/stock")
public class StockMgmtController {
	@Autowired	
	private StockMgmtService sms;
	//@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	//@GetMapping("/product/{id}")
	@GetMapping("/product")
	public Product searchProduct(@RequestParam("pid") int id) {
				return sms.find(id);
	}
	
	@PostMapping("/product")
	public Message RegisterProduct(@RequestBody Product p) {
				return sms.addProduct(p);
	}
	
	@PutMapping("/product")
	public Message updateProduct(@RequestBody Product p) {
				return sms.updateProduct(p);
	}
}
