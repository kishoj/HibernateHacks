package com.tutorials.hibernate.elementcollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.tutorials.hibernate.common.DAOUtils;

public class CreateHotel {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.setName("Raddison Hotel");
		
		hotel.setPhones(Arrays.asList("0123456", "0987654", "0456789"));
		
		Map<String, String> map = new HashMap<>();
		map.put("Bangkok", "0123456");
		map.put("Phuket", "0987654");
		map.put("Hua-Hin", "0456789");		
		hotel.setBranchPhone(map);
		
		DAOUtils.HOTEL.save(hotel);

		DAOUtils.HOTEL.findAll().forEach(hotel1 -> System.out.println(hotel1.toString()));
	}

}
