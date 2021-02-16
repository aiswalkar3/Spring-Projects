package com.EECS.SpringNonSingletonBeanDemo;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringNonSingletonBeanDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-config.xml"));
		context.refresh();
		
		Product product1 = context.getBean("nonSingleton", Product.class);
		Product product2 = context.getBean("nonSingleton", Product.class);
		
		System.out.println("Identity Equal: "+(product1 == product2));
		System.out.println("Value Equal: "+ (product1.equals(product2)));
		System.out.println("Product1 name: "+ (product1.getName()));
		System.out.println("Product2 name: "+ (product2.getName()));
		System.out.println(product1);
		System.out.println(product2);
		context.close();
	}
}