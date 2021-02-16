package com.EECS.XMLUnitInjectionDemo;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Product {
	private ProductType productType;
	
	/*
	public Product(ProductType type)
	{
		this.type = type;
	}
	*/
	public void setProductType(ProductType productType)
	{
		this.productType = productType;
	}
	
	public String getProductType()
	{
		return productType.getProductType();
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.refresh();
		Product bean = context.getBean("product",Product.class);
		System.out.println(bean.getProductType());
		context.close();
	}
}
