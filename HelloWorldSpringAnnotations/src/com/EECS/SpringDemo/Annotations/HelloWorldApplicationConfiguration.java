package com.EECS.SpringDemo.Annotations;

import com.EECS.SpringDemo.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.EECS.SpringDemo"})
@Configuration
public class HelloWorldApplicationConfiguration {
	/*
	@Bean
	public MessageGetter getter()
	{
		return new HelloWorldMessageGetter();
	}
	
	@Bean
	public MessageDisplayer displayer()
	{
		MessageDisplayer displayer = new StandardOutputMessageDisplayer();
		displayer.setMessageGetter(getter());
		return displayer;
	}
	*/
}
