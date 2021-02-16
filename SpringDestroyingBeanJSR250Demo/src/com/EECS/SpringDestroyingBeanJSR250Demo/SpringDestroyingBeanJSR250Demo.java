package com.EECS.SpringDestroyingBeanJSR250Demo;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.support.GenericXmlApplicationContext;


public class SpringDestroyingBeanJSR250Demo {
	private File file;
	private String filePath;
	
	@PostConstruct
	public void afterPropertiesSet() throws IOException
	{
		System.out.println("Initializing Bean");
		if (filePath == null) {
		throw new IllegalArgumentException(
		"You must specify the filePath property of " +
				SpringDestroyingBeanJSR250Demo.class);
		}
		this.file = new File(filePath);
		this.file.createNewFile();
		System.out.println("File exists: " + file.exists());
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroying Bean");
		
		if(!file.delete())
		{
			System.err.println("Error: failed to delete file");
		}
		
		System.out.println("File exists: " + file.exists());
	}
	
	public void setFilePath(String filePath)
	{
		this.filePath = filePath;
	}
	
	public static void main(String []args)
	{
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:spring/app-config.xml");
		context.refresh();
		SpringDestroyingBeanJSR250Demo bean = context.getBean("destroyingBean", 
				SpringDestroyingBeanJSR250Demo.class);
		System.out.println("Calling destroy()");
		context.destroy();
		System.out.println("Called destroy()");
	}
}
