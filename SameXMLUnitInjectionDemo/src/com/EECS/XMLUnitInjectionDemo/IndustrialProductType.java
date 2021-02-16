package com.EECS.XMLUnitInjectionDemo;

public class IndustrialProductType implements ProductType{
	private String productType;
	
	public IndustrialProductType(String productType)
	{
		this.productType = productType;
	}
	
	public String getProductType()
	{
		return productType;
	}
}
