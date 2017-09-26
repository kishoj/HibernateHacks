package com.tutorials.hibernate.onetoone.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registered_car")
public class RegisteredCar extends Car {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5921577802075342340L;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id")
	private RegistrationBook book;
	
	public RegisteredCar() { }

	public RegistrationBook getBook() {
		return book;
	}

	public void setBook(RegistrationBook book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "RegisteredCar [book=" + book + ", model=" + model + ", brand=" + brand + ", cc=" + cc + ", modelYear="
				+ modelYear + ", engineNumber=" + engineNumber + ", chassisNumber=" + chassisNumber + ", id=" + id
				+ "]";
	}
		
}
