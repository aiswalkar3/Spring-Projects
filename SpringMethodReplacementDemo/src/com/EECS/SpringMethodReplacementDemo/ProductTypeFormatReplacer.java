package com.EECS.SpringMethodReplacementDemo;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ProductTypeFormatReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object arg0, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		if(isFormatProductTypeMethod(method))
		{
			String formatttedProductType = (String)args[0];
			return "<h2>" + formatttedProductType + "</h2>";
		}
		else
		{
			throw new IllegalArgumentException("Unable to reimplement function: " 
					+ method.getName());
		}
		
	}
	
	private boolean isFormatProductTypeMethod(Method method)
	{
		if(method.getParameterTypes().length != 1)
		{
			return false;
		}
		
		if(!("formatProductType".equals(method.getName())))
		{
			return false;
		}
		
		if(method.getReturnType() != String.class)
		{
			return false;
		}
		
		if(method.getParameterTypes()[0] != String.class)
		{
			return false;
		}
		
		return true;
	}
}
