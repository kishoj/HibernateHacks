package com.tutorials.hibernate.common;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class UUIDEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -623110286657494773L;

	@Id
	@GeneratedValue
	protected UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
		
}
