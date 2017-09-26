package com.tutorials.hibernate.onetoone.bidirectional;

import java.time.LocalDate;
import java.util.UUID;

import com.tutorials.hibernate.common.DAOUtils;

public class MainApp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setDateOfBirth(LocalDate.of(1986, 8, 26));
		employee.setFullName("Kishoj Bajracharya");
		Employment employment = new Employment();
		employment.setEmploymentDate(LocalDate.of(2015, 05, 15));
		employment.setEmploymentId("12345");
		employment.setPosition("Java Programmer & DBA");
		employee.setEmployment(employment );
		DAOUtils.EMPLOYEE.save(employee);
		
		DAOUtils.EMPLOYEE.findAll().forEach(employee1 -> {
			System.out.println(employee1.toString());
			System.out.println(employee1.getEmployment().toString());
		});

		/*UUID uuid = UUID.fromString("d9ff7238-56fc-48ed-b276-d913336c2944");
		DAOUtils.EMPLOYEE.findOne(uuid);
		DAOUtils.EMPLOYEE.delete(DAOUtils.EMPLOYEE.findOne(uuid));*/
	}

}
