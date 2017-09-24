package com.tutorials.hibernate.common;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer extends UUIDEntity {
	
	private static final long serialVersionUID = -2995314239932147515L;
	
	@Id
	@GeneratedValue
	protected UUID id;

	public void setId(UUID id) {
		this.id = id;
	}
	
	private String firstName;
	private String lastName;	
	private LocalDate dateOfBirth;
	
	@ElementCollection
    private List<Address> addresses = new ArrayList<>();
    	
	@Embeddable
    public static class Address {
		private String street;
		private String city;
		private String zipCode;
		private String country;
		
		public Address() { }

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getZipCode() {
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + ", country=" + country
					+ "]";
		}		
		
	}
	
	public Customer() { }

	public UUID getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", nationality=" + "]";
	}
		
}