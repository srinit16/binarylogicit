package org.thewalking.stock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewalking.stock.entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Long>{
			
			public List<Product> findProductByCategoryId(long id);
}
