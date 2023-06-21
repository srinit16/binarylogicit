package org.thewalk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewalk.entities.Product;
import org.thewalk.entities.dao.ProductCategoryDao;
import org.thewalk.entities.dao.ProductDao;

@Service
public class WalkingService {
	
			@Autowired
			ProductDao pdao;
			@Autowired
			ProductCategoryDao pcdao;
	
			public Optional<Product> find(Long id) {
				    return pdao.findById(id);
			}
			
			public List<Product> findByCategoryId(Long id) {
			    // find it by category id
		    }
			
			
}
