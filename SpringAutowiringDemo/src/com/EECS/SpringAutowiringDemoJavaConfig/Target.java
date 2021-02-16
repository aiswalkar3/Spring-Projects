package com.EECS.SpringAutowiringDemoJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
@Component("target")
@Lazy
public class Target {
	
	@Configuration
	static class TargetConfig
	{
		@Bean
		public Product productImplFirst()
		{
			return new ProductImplOne();
		}
		
		@Bean
		public Product productImplSecond()
		{
			return new ProductImplSecond();
		}
		
		@Bean
		public ProductType productType()
		{
			return new ProductType();
		}
		
		@Bean
		public Target target()
		{
			return new Target();
		}
		
	}
	
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
		GenericApplicationContext context = new AnnotationConfigApplicationContext(TargetConfig.class);
		Target t = context.getBean(Target.class);
		context.close();
	}
	
}
