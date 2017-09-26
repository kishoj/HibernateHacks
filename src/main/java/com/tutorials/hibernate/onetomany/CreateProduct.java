package com.tutorials.hibernate.onetomany;

import java.math.BigDecimal;

import com.tutorials.hibernate.common.DAOUtils;
import com.tutorials.hibernate.common.Product;

public class CreateProduct {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("IPhone X");
		product1.setPrice(BigDecimal.valueOf(1000));
		product1.setCurrrency("USD");
		DAOUtils.PRODUCT.save(product1);
		
		Product product2 = new Product();
		product2.setName("IPhone 8");
		product2.setPrice(BigDecimal.valueOf(700));
		product2.setCurrrency("USD");
		DAOUtils.PRODUCT.save(product2);
		
		DAOUtils.PRODUCT.findAll().forEach(product -> 
			System.out.println(product.toString()));
		
	}

}
