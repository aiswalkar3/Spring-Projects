package com.EECS.SpringBeanInheritanceDemo;

public class Product {
	private String name;
	private String productType;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setProductType(String productType)
	{
		this.productType = productType;
	}
	
	@Override
	public String toString()
	{
		return "name: " + name + " productType: " + productType;
	}
}
