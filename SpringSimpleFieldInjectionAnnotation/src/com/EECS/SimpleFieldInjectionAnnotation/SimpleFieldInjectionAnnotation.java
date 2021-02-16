package com.EECS.SimpleFieldInjectionAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service("simplefieldinjectionannotation")
public class SimpleFieldInjectionAnnotation {
	@Value("334807803")
	private long id;
	@Value("John Davis")
	private String name;
	@Value("3.7")
	private double gpa;
	@Value("spring")
	private String semester;
	@Value("true")
	private boolean passed;
	@Value("2020")
	private int year;
	
	@Override
	public String toString()
	{
		return id + "\n" + name + "\n" + gpa + "\n" + semester + "\n" + passed + "\n" + year;
	}
	
	public static void main(String []args)
	{
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.refresh();
		SimpleFieldInjectionAnnotation bean = context.getBean("simplefieldinjectionannotation",
				SimpleFieldInjectionAnnotation.class);
		System.out.println(bean);
		context.close();
	}
	
}
