package org.thewalking.stock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewalking.stock.dao.ProductCategoryDao;
import org.thewalking.stock.dao.ProductDao;
import org.thewalking.stock.entities.Product;
import org.thewalking.stock.entities.ProductCategory;

@Service
public class ProductService {
		@Autowired
		ProductDao pdao;
		
		@Autowired
		ProductCategoryDao dao;
		
		public Optional<Product> find(long id) {
				return pdao.findById(id);
		}
		
		public List<Product> findAll(long id) {
			return pdao.findProductByCategoryId(id);
	    }
		
		public List<ProductCategory> findAll() {
			return dao.findAll();
	    }
		
}
