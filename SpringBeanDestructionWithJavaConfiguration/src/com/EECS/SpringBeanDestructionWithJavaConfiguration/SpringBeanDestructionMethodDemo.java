package com.EECS.SpringBeanDestructionWithJavaConfiguration;

import java.io.File;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringBeanDestructionMethodDemo{
	private File file;
	private String filePath;

	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Initializing Bean");
		if(filePath == null)
		{
			throw new IllegalArgumentException("Please specify file path property of class: " 
					+ SpringBeanDestructionMethodDemo.class);
		}
		
		this.file = new File(filePath);
		this.file.createNewFile();
		System.out.println("File exists: " + file.exists());
	}
	
	public void setFilePath(String filePath)
	{
		this.filePath = filePath;
	}
	
	public void destroy()
	{
		System.out.println("Destroying bean");
		
		if(!file.delete())
		{
			System.err.println("Failed to delete the file");
		}
		
		System.out.println("File exists: " + file.exists());
	}
}
