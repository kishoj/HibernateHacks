package com.tutorials.hibernate.onetomany.foreignkeys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.tutorials.hibernate.common.UUIDEntity;

@Entity
@Table(name="album")
public class Album extends UUIDEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3951905518790084354L;

	private String name;
	private String location;
	private String type;
	
	@OneToMany(cascade=CascadeType.ALL)
    @JoinTable(
        name="album_photo",
        joinColumns=@JoinColumn(name="album_id"),
        inverseJoinColumns=@JoinColumn(name="photo_id")
    )
    private List<Photo> photos = new ArrayList<>();
	
	public Album() { }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return "Album [name=" + name + ", location=" + location + ", type=" + type + ", photos=" + photos + ", id=" + id
				+ "]";
	}
	
	
}
