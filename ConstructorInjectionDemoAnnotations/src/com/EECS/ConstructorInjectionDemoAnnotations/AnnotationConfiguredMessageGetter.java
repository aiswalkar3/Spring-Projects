package com.EECS.ConstructorInjectionDemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class AnnotationConfiguredMessageGetter implements MessageGetter
{
	private String message;
	
	/*
	@Autowired
	public AnnotationConfiguredMessageGetter
	(@Value("Message Configuration with value") String message)
	{
		this.message = message;
	}
	*/
	
	@Autowired
	public AnnotationConfiguredMessageGetter(String message)
	{
		this.message = message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}
