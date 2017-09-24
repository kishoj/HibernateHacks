package com.tutorials.hibernate.common;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends UUIDEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7695527122903116580L;

	private String name;
	
	private BigDecimal price;
	
	public Product() { 
		this.id = UUID.randomUUID();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
		
}
