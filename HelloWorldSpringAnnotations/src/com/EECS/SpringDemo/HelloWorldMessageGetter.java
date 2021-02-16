package com.EECS.SpringDemo;
import org.springframework.stereotype.Component;

@Component("getter")
public class HelloWorldMessageGetter implements MessageGetter
{
	@Override
	public String getMessage()
	{
		return "Hello World!";
	}
}
