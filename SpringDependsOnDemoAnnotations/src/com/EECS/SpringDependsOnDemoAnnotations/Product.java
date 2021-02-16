package com.EECS.SpringDependsOnDemoAnnotations;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("industryProduct")
@DependsOn("insurance")
public class Product implements ApplicationContextAware{
	ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
	throws BeansException
	{
		this.context = applicationContext;
	}
	
	private ProductLineOfBusiness lineOfBusiness;
	
	public Product()
	{
		
	}
	
	public void lineOfBusiness()
	{
		lineOfBusiness = context.getBean("insurance",ProductLineOfBusiness.class);
		System.out.println("Line of Business: " + lineOfBusiness.getLineOfBusiness());
	}
}