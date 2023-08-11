package org.thewalking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewalking.dao.ProductCategoryDao;
import org.thewalking.dao.ProductDao;
import org.thewalking.entities.Product;
import org.thewalking.entities.ProductCategory;
import org.thewalking.util.Message;

@Service
public class StockMgmtService {
	@Autowired
	private ProductDao pdao;
	
	@Autowired
	private ProductCategoryDao pcdao;
	// 1
	public  Product  find(int id) {
		 Product p=null;
		 Optional<Product> opt=pdao.findById(id);
		 if(opt.isPresent()) {
			 p=opt.get();
		 }
		 return p;
	}
	
	public  List<ProductCategory>  findCategory() {
		return pcdao.findAll();
	}
	//2
	public Message addProduct(Product p) {
			pdao.save(p);
			Message m=new Message();
			m.setInfo("Product Registered Successfully");
			return m;
	}
	
	public Message updateProduct(Product p) {
		Message m=new Message();
		Product p1=this.find(p.getId());
		if(p1.getId()!=null) {
			p1=p;
			pdao.save(p1);
			m.setInfo("Product updated Successfully");
		}else {
			m.setInfo("Product Doesnt Exist");
		}
		
		return m;
}
	
	public  List<Product>  findByCategory(int id) {
				return pdao.findByCategoryId(id);
		
	}
}
