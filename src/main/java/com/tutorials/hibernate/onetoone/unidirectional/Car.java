package com.tutorials.hibernate.onetoone.unidirectional;

import javax.persistence.MappedSuperclass;

import com.tutorials.hibernate.common.UUIDEntity;

@MappedSuperclass
public abstract class Car extends UUIDEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1390917107298487593L;
	
    protected String model;
    protected String brand;
    protected int cc;
    protected String modelYear;
    protected String engineNumber;
    protected String chassisNumber;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	
	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", brand=" + brand + ", cc=" + cc + ", modelYear=" + modelYear
				+ ", engineNumber=" + engineNumber + ", chassisNumber=" + chassisNumber + "]";
	}

}
