package com.tutorials.hibernate.onetoone.bidirectional;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tutorials.hibernate.common.UUIDEntity;

@Entity
@Table(name="employee")
public class Employee extends UUIDEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4219235513681895258L;
	
	private String fullName;	
	private LocalDate dateOfBirth;
	
	private int age;

	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="employment_id")
    private Employment employment;
	
	public Employee() { }

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Transient
	public int getAge() {
		return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employment getEmployment() {
		return employment;
	}

	public void setEmployment(Employment employment) {
		this.employment = employment;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", employment="
				+ employment + ", id=" + id + "]";
	}
	
}
