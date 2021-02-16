package com.EECS.ConstructorInjectionDemoAnnotations;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ConstructorInjectionAnnotationsDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.refresh();
		MessageGetter getter = context.getBean("provider",MessageGetter.class);
		System.out.println(getter.getMessage());
		context.close();
	}
}
