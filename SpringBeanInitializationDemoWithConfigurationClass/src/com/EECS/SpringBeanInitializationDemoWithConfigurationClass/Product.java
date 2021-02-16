package com.EECS.SpringBeanInitializationDemoWithConfigurationClass;

public class Product {
	private static final String DEFAULT_NAME = "Domestic Cleaning Product"; 
	private String name;
	private int age = Integer.MIN_VALUE;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void init() throws Exception
	{
		System.out.println("Initializing bean");
		if(this.name == null)
		{
			name = DEFAULT_NAME;
		}
		else if(this.age == Integer.MIN_VALUE)
		{
			throw new IllegalArgumentException("Age field should be set for the product: " + Product.class);
		}
	}
	
	public String toString() {
		return "\tName: " + name + "\n\tAge: " + age;
		}
}
