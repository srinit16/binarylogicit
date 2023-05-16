package org.thewalking.stock.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewalking.stock.dao.ProductDao;
import org.thewalking.stock.entities.Product;

@Service
public class ProductService {
		@Autowired
		ProductDao pdao;
		
		public Optional<Product> find(long id) {
				return pdao.findById(id);
		}
}
