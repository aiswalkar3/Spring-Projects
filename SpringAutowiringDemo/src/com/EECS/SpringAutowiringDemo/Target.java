package com.EECS.SpringAutowiringDemo;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Target {
	private Product productFirst;
	private Product productSecond;
	private ProductType productType;
	
	public Target()
	{
		
	}
	
	public Target(Product product)
	{
		System.out.println("Target(Product) called");
	}
	
	public Target(Product product, ProductType productType)
	{
		System.out.println("Target(Product, ProductType) called");
	}
	
	public void setProductFirst(Product productFirst)
	{
		this.productFirst = productFirst;
		System.out.println("Property productFirst set");
	}
	
	public void setProductSecond(Product productSecond)
	{
		this.productSecond = productSecond;
		System.out.println("Property productSecond set");
	}
	
	public void setProductType(ProductType productType)
	{
		this.productType = productType;
		System.out.println("Property productType set");
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.refresh();
		
		Target t = null;
		
		System.out.println("Using byName:\n");
		t = context.getBean("targetByName", Target.class);
		
		System.out.println("\nUsing byType:\n");
		t = context.getBean("targetByType", Target.class);
		
		System.out.println("\nUsing constructor:\n");
		t = context.getBean("targetConstructor", Target.class);
		
		context.close();
	}
	
}
