package com.EECS.SpringCollectionsInjectionAnnotationsDemo;

import org.springframework.stereotype.Service;

@Service("productType")
public class ProductType {
	private String productType = "Domestic Cleaning Product";
	
	@Override
	public String toString()
	{
		return "ProductType: {" + productType + "}";
	}
}
