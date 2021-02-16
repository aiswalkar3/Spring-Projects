package com.EECS.SpringMethodReplacementDemo;

public class ProductTypeFormat {
	public String formatProductType(String productType)
	{
		return "<h1>" + productType + "</h1>";
	}
	
	public String formatProductType(Object productType)
	{
		return "<h1>" + productType + "</h1>";
	}
}
