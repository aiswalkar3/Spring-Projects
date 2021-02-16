package com.EECS.FieldInjection;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class FieldInjectionDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.refresh();
		Product product = context.getBean("product",Product.class);
		product.getProductType();
		context.close();
	}
}
