package org.thewalk.entities.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.thewalk.entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {
		
}
