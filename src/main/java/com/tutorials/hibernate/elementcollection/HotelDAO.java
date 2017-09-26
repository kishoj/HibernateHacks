package com.tutorials.hibernate.elementcollection;

import java.util.UUID;

import com.tutorials.hibernate.common.CrudDAO;
import com.tutorials.hibernate.common.HibernateUtility;

public class HotelDAO extends CrudDAO<Hotel, UUID> {

	public HotelDAO() {
		super(Hotel.class);
		this.entityManager = HibernateUtility.getEntityManager();
	}

}
