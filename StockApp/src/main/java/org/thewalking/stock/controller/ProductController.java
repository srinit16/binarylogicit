package org.thewalking.stock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thewalking.stock.entities.Product;
import org.thewalking.stock.entities.ProductCategory;
import org.thewalking.stock.service.ProductService;
import org.thewalking.stock.util.Message;

@RestController @CrossOrigin
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
		
		@GetMapping("/findByCategory")
		public List<Product> findByCategoryId(@RequestParam("id") long cid){
			return ps.findAll(cid);
			
		}
		
		@GetMapping("/category/all")
		public List<ProductCategory> ListCategory(){
			return ps.findAll();
			
		}
		
		@PostMapping
		public Message save(@RequestBody Product p) {
					return ps.createProduct(p);
		}
		
}
