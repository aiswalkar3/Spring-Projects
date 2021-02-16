package com.EECS.SpringDemo;

public class HelloWorldMessageGetter implements MessageGetter
{
	@Override
	public String getMessage()
	{
		return "Hello World!";
	}
}
