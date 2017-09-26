package com.tutorials.hibernate.onetoone.bidirectional;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tutorials.hibernate.common.UUIDEntity;

@Entity
@Table(name="employment")
public class Employment extends UUIDEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3882954548040941848L;
	
	private LocalDate employmentDate;
	private String position;
	private String employmentId;
	
	@OneToOne(mappedBy="employment")
    private Employee employee;
	
	public Employment() { }

	public LocalDate getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(LocalDate employmentDate) {
		this.employmentDate = employmentDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String getEmploymentId() {
		return employmentId;
	}

	public void setEmploymentId(String employmentId) {
		this.employmentId = employmentId;
	}

	@Override
	public String toString() {
		return "Employment [employmentDate=" + employmentDate + ", position=" + position + ", employmentId="
				+ employmentId + "]";
	}
	
}
