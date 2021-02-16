package com.EECS.ConstructorInjectionDemoAnnotationsMultipleConstructors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MulipleConstructorsResolutionDemo {
	private String message;

	public MulipleConstructorsResolutionDemo(int val)
	{
		System.out.println("MulipleConstructorsResolutionDemo(int val) called");
		this.message = "Integer: "+ val;
	}
	
	public MulipleConstructorsResolutionDemo(String message)
	{
		System.out.println("MulipleConstructorsResolutionDemo(String message) called");
		this.message = message;
	}
	
	@Override
	public String toString()
	{
		return message;
	}
	
	public static void main(String []args)
	{
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.refresh();
		MulipleConstructorsResolutionDemo demo = context.getBean("MulipleConstructorsResolutionDemo",
				MulipleConstructorsResolutionDemo.class);
		System.out.println(demo);
		context.close();
	}
}
