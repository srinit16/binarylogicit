package org.thewalking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.thewalking.entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
	
	
	public List<Product> findByCategoryId(int id);
	
//	@Query(value=" select p from Product p where p.category.id=:db")
//	public List<Product> listProduct(@Param("db") int id);
			
}
