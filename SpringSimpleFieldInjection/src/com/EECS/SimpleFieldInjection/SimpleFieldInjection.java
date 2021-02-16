package com.EECS.SimpleFieldInjection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleFieldInjection {
	private long id;
	private String name;
	private double gpa;
	private String semester;
	private boolean passed;
	private int year;
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	public void setSemester(String semester)
	{
		this.semester = semester;
	}
	
	public void setPassed(boolean passed)
	{
		this.passed = passed;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return id + "\n" + name + "\n" + gpa + "\n" + semester + "\n" + passed + "\n" + year;
	}
	
	public static void main(String []args)
	{
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("spring/app-context.xml");
		context.refresh();
		SimpleFieldInjection simpleField = context.getBean("simplefieldinjection",SimpleFieldInjection.class);
		System.out.println(simpleField);
		context.close();
	}
}
