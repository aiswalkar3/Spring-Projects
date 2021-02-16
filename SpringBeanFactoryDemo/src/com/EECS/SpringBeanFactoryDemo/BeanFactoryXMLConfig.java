package com.EECS.SpringBeanFactoryDemo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryXMLConfig {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("spring/xml-bean-factory-config.xml"));
		PremiumCover cover = factory.getBean("premiumcover", PremiumCover.class);
		System.out.println(cover.getRate());
	}

}
