package com.tutorials.hibernate.common.dao;

import com.tutorials.hibernate.common.CrudDAO;
import com.tutorials.hibernate.common.HibernateUtility;
import com.tutorials.hibernate.common.SaleOrder;

public class SaleOrderDAO extends CrudDAO<SaleOrder, Long> {

	public SaleOrderDAO() {
		super(SaleOrder.class);
		this.entityManager = HibernateUtility.getEntityManager();
	}
	
	public void closeConnection() {
		HibernateUtility.close();
	}

}
