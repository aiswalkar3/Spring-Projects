package com.SpringBeanNamingAnnotations;

import org.springframework.stereotype.Component;

@Component("IndustrialProduct")
public class Product {
	private String product = "Indutrial Product";
	
	private void getProduct()
	{
		System.out.println(product);
	}
}
