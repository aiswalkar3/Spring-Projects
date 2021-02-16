package com.EECS.SpringDependsOnDemoAnnotations;

import org.springframework.stereotype.Component;

@Component("insurance")
public class ProductLineOfBusiness {
	private String lineOfBusiness = "insurance line";
	
	public String getLineOfBusiness()
	{
		return lineOfBusiness;
	}
}
