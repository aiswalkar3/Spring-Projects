package com.EECS.ConstructorInjectionDemo;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ConstructorInjectionDemoXMLConfigDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-config.xml"));
		context.refresh();
		MessageProvider provider = context.getBean("MessageProvider",MessageProvider.class);
		System.out.print(provider.getMessage());
		context.close();
	}
}
