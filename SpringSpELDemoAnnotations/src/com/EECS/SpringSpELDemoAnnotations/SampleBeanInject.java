package com.EECS.SpringSpELDemoAnnotations;

import org.springframework.stereotype.Component;

@Component("samplebeaninject")
public class SampleBeanInject {
	private long id = 334807803;
	private String name = "John Davis";
	private double gpa = 3.7;
	private String semester = "spring";
	private boolean passed = true;
	private int year = 2020;
	
	public long getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public String getSemester()
	{
		return semester;
	}
	
	public boolean isPassed()
	{
		return passed;
	}
	
	public double getYear()
	{
		return year;
	}
}
