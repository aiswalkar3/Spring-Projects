package com.EECS.SpringAliasForDemo;

import org.springframework.stereotype.Component;

@Component("Industrial Product")
@Trophy(name = {"platinum standard product","gold standard product"})
public class Product {
	private String productLineOfBusiness = "Chemical Industry";
	
	public void lineOfBusiness()
	{
		System.out.println(productLineOfBusiness);
	}
}
