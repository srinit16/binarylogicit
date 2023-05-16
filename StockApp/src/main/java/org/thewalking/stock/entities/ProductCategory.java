package org.thewalking.stock.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Table(name="PRODUCT_CATEGORY")
//@Data
@Setter @Getter
public class ProductCategory {
	@Id @Column(name="ID")
	private int id;
	@Column(name="CATEGORY_NAME")
	private String name;

}
