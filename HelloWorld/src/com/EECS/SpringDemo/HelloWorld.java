package com.EECS.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	public static void main(String []args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		MessageDisplayer displayer = context.getBean("displayer", MessageDisplayer.class);
		displayer.displayMessage();
	}
}
