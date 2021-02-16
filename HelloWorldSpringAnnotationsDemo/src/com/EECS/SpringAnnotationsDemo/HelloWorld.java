package com.EECS.SpringAnnotationsDemo;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context-annotation.xml"));
		context.refresh();
		MessageDisplayer displayer = context.getBean("displayer",MessageDisplayer.class);
		displayer.displayMessage();
		context.close();
	}

}
