package com.EECS.FieldInjection;

import org.springframework.stereotype.Component;

@Component("producttype")
public class ProductType {
	private String productType;
	
	public ProductType(String productType)
	{
		this.productType = productType;
	}
	
	public String getProductType()
	{
		return productType;
	}
}
