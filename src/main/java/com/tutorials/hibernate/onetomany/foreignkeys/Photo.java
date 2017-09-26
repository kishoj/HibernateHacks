package com.tutorials.hibernate.onetomany.foreignkeys;

import com.tutorials.hibernate.common.UUIDEntity;

public class Photo extends UUIDEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1692522918880458951L;

	private String filename;
	private String location;
	private int size;
	
	public Photo() { }

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Photo [filename=" + filename + ", location=" + location + ", size=" + size + ", id=" + id + "]";
	}
	
}
