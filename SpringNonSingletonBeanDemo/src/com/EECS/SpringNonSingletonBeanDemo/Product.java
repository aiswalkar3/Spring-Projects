package com.EECS.SpringNonSingletonBeanDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("nonSingleton")
@Scope("prototype")
public class Product {
	private String name = "unknown product";
	
	public Product(@Value("Industrial Product")String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
