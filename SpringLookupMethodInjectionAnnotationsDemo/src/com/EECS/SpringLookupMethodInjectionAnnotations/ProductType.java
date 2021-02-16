package com.EECS.SpringLookupMethodInjectionAnnotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("productType")
@Scope("prototype")
public class ProductType {
	private String productType = "Domestic Cleaning Product";
	
	public void checkProductType()
	{
		
	}
}
