package com.EECS.SpringBeanInheritanceDemo;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringBeanInheritanceDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-config.xml"));
		context.refresh();
		
		Product parent = context.getBean("parent",Product.class);
		Product child = context.getBean("child",Product.class);
		
		System.out.println("Parent:\n"+parent);
		System.out.println("Child:\n"+child);
		context.close();
	}
}