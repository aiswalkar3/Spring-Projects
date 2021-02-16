package com.EECS.SpringAutowiringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
@Component("targetByType")
@Lazy
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
	
	@Autowired
	@Qualifier("productImplFirst")
	public void setProductFirst(Product productFirst)
	{
		this.productFirst = productFirst;
		System.out.println("Property productFirst set");
	}
	
	@Autowired
	@Qualifier("productImplSecond")
	public void setProductSecond(Product productSecond)
	{
		this.productSecond = productSecond;
		System.out.println("Property productSecond set");
	}
	
	@Autowired
	public void setProductType(ProductType productType)
	{
		this.productType = productType;
		System.out.println("Property productType set");
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context-3.xml"));
		context.refresh();
		
		System.out.println("\nUsing byType:\n");
		Target t = context.getBean("targetByType", Target.class);
		
		context.close();
	}
	
}
