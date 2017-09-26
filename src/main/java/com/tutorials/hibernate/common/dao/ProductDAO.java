package com.tutorials.hibernate.common.dao;

import java.util.UUID;

import com.tutorials.hibernate.common.CrudDAO;
import com.tutorials.hibernate.common.HibernateUtility;
import com.tutorials.hibernate.common.Product;

public class ProductDAO extends CrudDAO<Product, UUID> {

	public ProductDAO() {
		super(Product.class);
		this.entityManager = HibernateUtility.getEntityManager();
	}
	
	public void closeConnection() {
		HibernateUtility.close();
	}
	
	public void openConnection() {
		HibernateUtility.open();
	}

}
