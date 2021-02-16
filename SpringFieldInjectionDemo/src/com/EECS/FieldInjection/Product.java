package com.EECS.FieldInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("product")
public class Product {
	@Autowired
	private ProductType type;
	
	public void getProductType()
	{
		System.out.println("Product type: " + type.getProductType());
	}
}
