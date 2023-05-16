package org.thewalking.stock.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thewalking.stock.entities.Product;
import org.thewalking.stock.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
		@Autowired
		ProductService ps;
		
		@GetMapping("/find/{id}")
		public Product findById(@PathVariable("id") long id) {
			Product p=new Product();
			Optional<Product> op=ps.find(id);
			if(op.isPresent()) {
				p=op.get();
			}
			return p;
		}
}
