package com.EECS.SpringLookupMethodInjectionDemo;

public class SetterInjectionLookupDemoBean implements MethodInjectionDemoBean{
	private ProductType productType;
	
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
