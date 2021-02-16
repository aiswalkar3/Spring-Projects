package com.EECS.CollectionsInjectionDemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CollectionInjectionDemo {
	private List list;
	private Set set;
	private Properties props;
	private Map<String, Object> map;
	
	public void setList(List list)
	{
		this.list = list;
	}
	
	public void setSet(Set set)
	{
		this.set = set;
	}
	
	public void setMap(Map<String, Object> map)
	{
		this.map = map;
	}
	
	public void setProps(Properties props)
	{
		this.props = props;
	}
	
	public void display()
	{
		System.out.println("List contents:\n");
		list.stream().forEach(obj -> System.out.println("Value: " + obj));
		
		System.out.println("\nSet contents:\n");
		set.stream().forEach(obj -> System.out.println("Value: " + obj));
		
		System.out.println("\nMap contents:\n");
		map.entrySet().stream().forEach(entry -> System.out.println("Key: "+ entry.getKey() 
												+ " Value: " + entry.getValue()));
		
		System.out.println("\nProperties contents:\n");
		props.entrySet().stream().forEach(entry -> System.out.println("Key: " + entry.getKey()
		+ " Value: " + entry.getValue()));
	}
	
	public static void main(String []args)
	{
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.refresh();
		CollectionInjectionDemo demo = context.getBean("collectionInjection",CollectionInjectionDemo.class);
		demo.display();
		context.close();
	}
}
