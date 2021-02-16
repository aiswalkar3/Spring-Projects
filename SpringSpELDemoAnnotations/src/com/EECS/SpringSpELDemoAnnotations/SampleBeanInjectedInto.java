package com.EECS.SpringSpELDemoAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("samplebeaninjectedinto")
public class SampleBeanInjectedInto {
	@Value("#{samplebeaninject.id}")
	private long id;
	@Value("#{samplebeaninject.name}")
	private String name;
	@Value("#{samplebeaninject.gpa}")
	private double gpa;
	@Value("#{samplebeaninject.semester}")
	private String semester;
	@Value("#{samplebeaninject.passed}")
	private boolean passed;
	@Value("#{samplebeaninject.year}")
	private int year;
	
	public long getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	public String getSemester()
	{
		return semester;
	}
	
	public void setSemester(String semester)
	{
		this.semester = semester;
	}
	
	public boolean isPassed()
	{
		return passed;
	}
	
	public void setPassed(boolean passed)
	{
		this.passed = passed;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String toString()
	{
		return id + "\n" + name + "\n" + gpa + "\n" + semester + "\n" + passed + "\n" + year;
	}
}
