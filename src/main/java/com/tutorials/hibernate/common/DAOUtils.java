package com.tutorials.hibernate.common;

import com.tutorials.hibernate.common.dao.CustomerDAO;
import com.tutorials.hibernate.common.dao.ProductDAO;
import com.tutorials.hibernate.elementcollection.HotelDAO;
import com.tutorials.hibernate.onetoone.bidirectional.EmployeeDAO;
import com.tutorials.hibernate.onetoone.unidirectional.RegisteredCarDAO;

public interface DAOUtils {
	CustomerDAO CUSTOMER = new CustomerDAO();
	ProductDAO PRODUCT = new ProductDAO();
	
	HotelDAO HOTEL = new HotelDAO();	
	RegisteredCarDAO REGISTERED_CAR = new RegisteredCarDAO();
	EmployeeDAO EMPLOYEE = new EmployeeDAO();
}
