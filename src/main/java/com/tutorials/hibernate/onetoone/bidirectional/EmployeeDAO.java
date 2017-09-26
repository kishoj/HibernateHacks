package com.tutorials.hibernate.onetoone.bidirectional;

import java.util.UUID;

import com.tutorials.hibernate.common.CrudDAO;
import com.tutorials.hibernate.common.HibernateUtility;

public class EmployeeDAO extends CrudDAO<Employee, UUID> {

	public EmployeeDAO() {
		super(Employee.class);
		this.entityManager = HibernateUtility.getEntityManager();
	}

}
