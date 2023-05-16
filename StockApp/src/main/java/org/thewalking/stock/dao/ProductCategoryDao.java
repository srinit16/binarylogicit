package org.thewalking.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewalking.stock.entities.Product;
import org.thewalking.stock.entities.ProductCategory;

@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Long>{
	

}
