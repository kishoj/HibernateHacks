package com.tutorials.hibernate.onetoone.unidirectional;

import java.util.UUID;

import com.tutorials.hibernate.common.CrudDAO;
import com.tutorials.hibernate.common.HibernateUtility;

public class RegisteredCarDAO extends CrudDAO<RegisteredCar, UUID> {

	public RegisteredCarDAO() {
		super(RegisteredCar.class);
		this.entityManager = HibernateUtility.getEntityManager();
	}
}
