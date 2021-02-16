package com.EECS.SpringDependsOnDemoAnnotations;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDependsOnDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-config.xml"));
		context.refresh();
		
		Product product = context.getBean("industryProduct",Product.class);
		product.lineOfBusiness();
		
		context.close();
	}
}
