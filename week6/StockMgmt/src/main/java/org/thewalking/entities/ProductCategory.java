package org.thewalking.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity @Table(name="product_category")
@Setter @Getter
public class ProductCategory {
	
	@Id @Column(name="category_id")
	private int id;
	@Column(name="category_name")
	private String name;
	@JsonIgnore
	@OneToMany(mappedBy="category", fetch=FetchType.LAZY)
	private List<Product> productList;
	
}
