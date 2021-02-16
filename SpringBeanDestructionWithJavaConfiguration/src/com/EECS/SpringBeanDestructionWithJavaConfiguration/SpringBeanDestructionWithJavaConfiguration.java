package com.EECS.SpringBeanDestructionWithJavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringBeanDestructionWithJavaConfiguration {
	
	@Configuration
	static class SpringBeanDestructionMethodConfig
	{
		@Lazy
		@Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
		SpringBeanDestructionMethodDemo disposableBean()
		{
			SpringBeanDestructionMethodDemo bean = new SpringBeanDestructionMethodDemo();
			bean.setFilePath("D:/EECS Internship/University Internship/test.txt");
			return bean;
		}
	}
	
	public static void main(String []args)
	{
		GenericApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringBeanDestructionMethodConfig.class);
		
		SpringBeanDestructionMethodDemo bean = context.getBean("disposableBean", 
				SpringBeanDestructionMethodDemo.class);
		/*
		System.out.println("Calling destroy()");
		context.destroy();
		System.out.println("Called destroy()");
		*/
		context.registerShutdownHook();
	}
}
