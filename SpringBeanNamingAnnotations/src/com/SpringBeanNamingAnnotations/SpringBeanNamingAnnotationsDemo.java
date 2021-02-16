package com.SpringBeanNamingAnnotations;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringBeanNamingAnnotationsDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-config.xml"));
		context.refresh();
		Map<String,Product> beans= context.getBeansOfType(Product.class);
		
		beans.entrySet().stream().forEach(bean->System.out.println("id: "+bean.getKey()));
		context.close();
	}
}
