package com.EECS.SpringSpELDemoAnnotations;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SampleBeanSpELDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(new ClassPathResource("spring/app-context.xml"));
		context.refresh();
		SampleBeanInjectedInto bean = context.getBean("samplebeaninjectedinto", 
				SampleBeanInjectedInto.class);
		System.out.println(bean);
		context.close();
	}
}
