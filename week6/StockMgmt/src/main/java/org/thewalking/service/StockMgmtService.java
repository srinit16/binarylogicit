package org.thewalking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewalking.dao.ProductDao;
import org.thewalking.entities.Product;
import org.thewalking.util.Message;

@Service
public class StockMgmtService {
	@Autowired
	private ProductDao pdao;
	
	public  Product  find(int id) {
		 Product p=null;
		 Optional<Product> opt=pdao.findById(id);
		 if(opt.isPresent()) {
			 p=opt.get();
		 }else {
			 p=new Product();
		 }
		 return p;
	}
	
	public Message addProduct(Product p) {
			pdao.save(p);
			Message m=new Message();
			m.setInfo("Product Registered Successfully");
			return m;
	}

}
