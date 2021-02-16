package com.EECS.SpringDisposableInterfaceDemo;

import java.io.File;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDisposableInterfaceDemo implements InitializingBean,DisposableBean{
	private File file;
	private String filePath;

	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Initializing Bean");
		if(filePath == null)
		{
			throw new IllegalArgumentException("Please specify file path property of class: " 
					+ SpringDisposableInterfaceDemo.class);
		}
		
		this.file = new File(filePath);
		this.file.createNewFile();
		System.out.println("File exists: " + file.exists());
	}
	
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
		SpringDisposableInterfaceDemo bean = context.getBean("destroyingBean", 
				SpringDisposableInterfaceDemo.class);
		System.out.println("Calling destroy()");
		context.destroy();
		System.out.println("Called destroy()");
	}
}
