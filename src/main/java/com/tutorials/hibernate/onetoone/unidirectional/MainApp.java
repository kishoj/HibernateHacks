package com.tutorials.hibernate.onetoone.unidirectional;

import java.time.LocalDate;

import com.tutorials.hibernate.common.DAOUtils;

public class MainApp {

	public static void main(String[] args) {
		RegisteredCar car = new RegisteredCar();
		RegistrationBook book = new RegistrationBook();
		book.setRegisteredDate(LocalDate.now());
		book.setRegistrationNumber("12345 KTM");
		book.setRegistrationType("Private");
		car.setBook(book);
		car.setBrand("BMW");
		car.setCc(2000);
		car.setChassisNumber("01AQwE23323333");
		car.setEngineNumber("0912345678");
		car.setModel("i-Series");
		car.setModelYear("2012");
		
		DAOUtils.REGISTERED_CAR.save(car);
		
		DAOUtils.REGISTERED_CAR.findAll().forEach(car1 -> System.out.println(car1.toString()));
	}

}
