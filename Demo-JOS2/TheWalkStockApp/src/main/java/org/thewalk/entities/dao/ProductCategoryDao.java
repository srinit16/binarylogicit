package org.thewalk.entities.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewalk.entities.ProductCategory;

@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Long> {

}
