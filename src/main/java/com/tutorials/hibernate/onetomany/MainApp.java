package com.tutorials.hibernate.onetomany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.tutorials.hibernate.common.Customer;
import com.tutorials.hibernate.common.Customer.Address;
import com.tutorials.hibernate.common.dao.CustomerDAO;

public class MainApp {

	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAO();		
		
		Customer customer = new Customer();
		customer.setDateOfBirth(LocalDate.of(1990, 12, 31));
		customer.setFirstName("Prasanna");
		customer.setLastName("Bajracharya");
		List<Address> addresses = new ArrayList<>();
		Address address = new Address();
		address.setCity("KTM");
		address.setCountry("Nepal");
		address.setStreet("Maitidevi");
		address.setZipCode("0977");
		
		addresses.add(address );
		
		customer.setAddresses(addresses);
		
		customer = customerDAO.save(customer);
		
		customerDAO.findAll().forEach(customer1 -> {
			System.out.println(customer1.toString());
			customer1.getAddresses().forEach(address1 -> System.out.println(address1.toString()));
		});
	}

}
