package com.EECS.SpringBeanInitializationDemoWithConfigurationClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

public class ProductBeanConfigDemo {
	
	@Configuration
	static class ProductBeanConfig{
		@Lazy
		@Bean(initMethod = "init")
		Product productOne()
		{
			Product productOne = new Product();
			productOne.setName("Industrial Cleaning Product");
			productOne.setAge(5);
			return productOne;
		}
		
		@Lazy
		@Bean(initMethod = "init")
		Product productTwo()
		{
			Product productTwo = new Product();
			productTwo.setAge(10);
			return productTwo;
		}
		
		@Lazy
		@Bean(initMethod = "init")
		Product productThree()
		{
			Product productThree = new Product();
			productThree.setName("Domestic Cutting Product");
			return productThree;
		}
	}
	
	public static void main(String []args)
	{
		GenericApplicationContext context = new AnnotationConfigApplicationContext(ProductBeanConfig.class);
		//context.refresh();
		getBean("productOne",context);
		getBean("productTwo",context);
		getBean("productThree",context);
		context.close();
	}
	
	private static Product getBean(String name, ApplicationContext context)
	{
		try {
			System.out.println("Getting bean");
			Product productBean = context.getBean(name, Product.class);
			System.out.println(productBean);
			return productBean;
		}
		catch(Exception e)
		{
			System.out.println("An error occured in bean configuration: " + e.getMessage());
			return null;
		}
	}
}
