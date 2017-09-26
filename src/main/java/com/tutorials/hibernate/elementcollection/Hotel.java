package com.tutorials.hibernate.elementcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderBy;
import javax.persistence.OrderColumn;

import com.tutorials.hibernate.common.UUIDEntity;

@Entity
@Table(name="hotel")
public class Hotel extends UUIDEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2392306566138677862L;

	private String name;
	
	@ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(
        name="hotel_phone",
        joinColumns=@JoinColumn(name="hotel_id")
    )	
	@OrderColumn(name="index_rank") 
	@OrderBy("phone DESC") 
    @Column(name="phone")
    private List<String> phones = new ArrayList<>();
	
	@ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(
        name="hotel_branch_phone",
        joinColumns=@JoinColumn(name="hotel_id")
    )
    @MapKeyColumn(name="branch")
    private Map<String, String> branchPhone = new HashMap<>();
	
	public Hotel() { }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getBranchPhone() {
		return branchPhone;
	}

	public void setBranchPhone(Map<String, String> branchPhone) {
		this.branchPhone = branchPhone;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", phones=" + phones + ", branchPhone=" + branchPhone + "]";
	}
	
}
