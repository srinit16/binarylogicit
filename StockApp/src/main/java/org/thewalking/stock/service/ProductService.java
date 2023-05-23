package org.thewalking.stock.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewalking.stock.dao.ProductCategoryDao;
import org.thewalking.stock.dao.ProductDao;
import org.thewalking.stock.entities.Product;
import org.thewalking.stock.entities.ProductCategory;
import org.thewalking.stock.util.Message;

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
		
		@Transactional
		public Message createProduct(Product p) {
				Message m1=new Message();
				try {
					Product p1=pdao.save(p);
					m1.setInfo("Product with Id ="+p1.getId()+ " is succcessfully added");
				}catch(Exception ex) {
					//throw new RuntimeException();
					m1.setInfo("Error occured while saving Product, Details :"+ex.toString());
				}
				return m1;
		}
		
}
