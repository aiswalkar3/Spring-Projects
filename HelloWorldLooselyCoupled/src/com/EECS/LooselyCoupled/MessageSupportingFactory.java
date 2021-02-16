package com.EECS.LooselyCoupled;

import java.util.Properties;

public class MessageSupportingFactory {
	private static MessageSupportingFactory instance;
	
	private Properties props;
	private MessageGetter getter;
	private MessageDisplayer displayer;
	
	private MessageSupportingFactory()
	{
		props = new Properties();
		
		try {
			props.load(this.getClass()
					.getResourceAsStream("MessageSupportingFactory.properties"));
			String messageGetterClass = props.getProperty("messagegetter.class");
			String messageDisplayerClass = props.getProperty("messagedisplayer.class");
			
			getter = (MessageGetter)Class.forName(messageGetterClass).newInstance();
			displayer = (MessageDisplayer)Class.forName(messageDisplayerClass).newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static
	{
		instance = new MessageSupportingFactory();
	}
	
	public static MessageSupportingFactory getMessageSupportingFactoryInstance()
	{
		return instance;
	}
	
	public MessageGetter getMessageGetter()
	{
		return getter;
	}
	
	public MessageDisplayer getMessageDisplayer()
	{
		return displayer;
	}
}
