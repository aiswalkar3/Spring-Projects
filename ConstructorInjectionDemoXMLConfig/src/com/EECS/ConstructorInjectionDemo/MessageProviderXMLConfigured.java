package com.EECS.ConstructorInjectionDemo;

public class MessageProviderXMLConfigured implements MessageProvider{
	String message;
	public MessageProviderXMLConfigured(String message)
	{
		this.message = message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}
