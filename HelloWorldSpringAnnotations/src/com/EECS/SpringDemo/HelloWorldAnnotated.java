package com.EECS.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.EECS.SpringDemo.Annotations.HelloWorldApplicationConfiguration;

public class HelloWorldAnnotated {
	public static void main(String []args)
	{
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(HelloWorldApplicationConfiguration.class);
		MessageDisplayer displayer = (MessageDisplayer)context.getBean("displayer");
		displayer.displayMessage();
	}
}