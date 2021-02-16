package com.EECS.SpringLookupMethodInjectionAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {
	
	@Configuration
	@ComponentScan(basePackages = {"com.EECS.SpringLookupMethodInjectionAnnotations"})
	public static class LookupConfig{
		
	}
	
	public static void main(String[] args) {
		GenericApplicationContext context = new AnnotationConfigApplicationContext(LookupConfig.class);
		
		MethodInjectionDemoBean abstractDemoBean =  context.getBean("abstractLookupDemoBean",
				MethodInjectionDemoBean.class);
		
		MethodInjectionDemoBean standardDemoBean =  context.getBean("setterInjectionLookupDemoBean",
				MethodInjectionDemoBean.class);
		displayInfo("abstractLookupDemoBean",abstractDemoBean);
		displayInfo("standardDemoBean",standardDemoBean);
		context.close();
	}
	
	private static void displayInfo(String beanName, MethodInjectionDemoBean bean)
	{
		ProductType productType1 = bean.getProductType();
		ProductType productType2 = bean.getProductType();
		
		System.out.println("\n"+beanName +": ProductType instances the Same? " + 
		(productType1 == productType2));
		
		StopWatch watch = new StopWatch();
		watch.start("lookupDemo");
		for(int x=0; x<100000; x++)
		{
			ProductType type = bean.getProductType();
			type.checkProductType();
		}
		
		watch.stop();
		System.out.println("100000 gets took "
				+ watch.getTotalTimeMillis() + " ms");
	}
	
}
