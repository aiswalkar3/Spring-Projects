package com.EECS.SpringLookupMethodInjectionAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("setterInjectionLookupDemoBean")
public class SetterInjectionLookupDemoBean implements MethodInjectionDemoBean{
	private ProductType productType;
	
	@Autowired
	@Qualifier("productType")
	public void setProductType(ProductType productType)
	{
		this.productType = productType;
	}
	
	@Override
	public ProductType getProductType()
	{
		return productType;
	}
	
	@Override
	public void performCheck()
	{
		productType.checkProductType();
	}
}
