package com.EECS.SpringAnnotationsDemo;
import org.springframework.stereotype.Component;
//simple bean
@Component("getter")
public class HelloWorldMessageGetter implements MessageGetter
{
	@Override
	public String getMessage()
	{
		return "Hello World!";
	}
}
