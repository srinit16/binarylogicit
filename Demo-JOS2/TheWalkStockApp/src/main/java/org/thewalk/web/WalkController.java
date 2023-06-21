package org.thewalk.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.thewalk.entities.Product;
import org.thewalk.entities.dao.ProductCategoryDao;
import org.thewalk.entities.dao.ProductDao;
import org.thewalk.services.WalkingService;

@RestController
@RequestMapping("/thewalk/api")
public class WalkController {
			@Autowired
			WalkingService ws;
	
//			@GetMapping("/callme")
//			//@RequestMapping(path={"callme"}, method=RequestMethod.GET)
//			public String get() {
//				return "index";
//			}
			
			@GetMapping("/product/{id}")
			public Product findById(@PathVariable("id") Long id) {
					Product p=null;
					Optional<Product> opt=ws.find(id);
					if(opt.isPresent()) {
						p=opt.get();
					}else {
						p=new Product();
					}
				return p;
			}
			
			public List<Product> findByCategory(Long id){
			
					return ws.findByCategoryId(id);
			}	
}
