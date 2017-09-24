package com.tutorials.hibernate.common.dao;

import com.tutorials.hibernate.common.CrudDAO;
import com.tutorials.hibernate.common.Customer;
import com.tutorials.hibernate.common.HibernateUtility;

public class CustomerDAO extends CrudDAO<Customer, Long> {

	public CustomerDAO() {
		super(Customer.class);
		this.entityManager = HibernateUtility.getEntityManager();
	}
	
	public void closeConnection() {
		HibernateUtility.close();
	}

}
