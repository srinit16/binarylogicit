package org.thewalking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewalking.entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {

}
