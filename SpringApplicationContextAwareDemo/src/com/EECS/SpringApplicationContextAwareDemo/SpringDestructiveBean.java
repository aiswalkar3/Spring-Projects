package com.EECS.SpringApplicationContextAwareDemo;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDestructiveBean {
	private File file;
	private String filePath;
	
	@PostConstruct
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Initializing Bean");
		
		if(filePath == null)
		{
			throw new IllegalArgumentException("Please specify file path property for class: "
					+SpringDestructiveBean.class);
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
			System.err.println("Failed to delete file");
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
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.registerShutdownHook();
		context.refresh();
		context.getBean("destructiveBean", SpringDestructiveBean.class);
	}
}
