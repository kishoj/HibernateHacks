package com.tutorials.hibernate.onetoone.unidirectional;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.tutorials.hibernate.common.UUIDEntity;

@Entity
@Table(name="registration_book")
public class RegistrationBook extends UUIDEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6873818991340730710L;
	
	private LocalDate registeredDate;
	private String registrationType;
	private String registrationNumber;
	
	public RegistrationBook() { }

	public LocalDate getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(LocalDate registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "RegistrationBook [registeredDate=" + registeredDate + ", registrationType=" + registrationType
				+ ", registrationNumber=" + registrationNumber + ", id=" + id + "]";
	}
	
	
}
