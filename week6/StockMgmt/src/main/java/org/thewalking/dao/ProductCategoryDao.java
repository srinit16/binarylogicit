package org.thewalking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewalking.entities.Product;
import org.thewalking.entities.ProductCategory;

@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {

}
