package com.EECS.SpringDemo;

public class StandardOutputMessageDisplayer implements MessageDisplayer{
	private MessageGetter getter;
	
	@Override
	public void setMessageGetter(MessageGetter getter)
	{
		this.getter = getter;
	}
	
	@Override
	public MessageGetter getMessageGetter()
	{
		return getter;
	}
	
	@Override
	public void displayMessage()
	{
		if(getter != null)
		{
			System.out.println(getter.getMessage());
		}
		else
		{
			throw new RuntimeException("Message getter not instantiated" 
					+ StandardOutputMessageDisplayer.class.getName());
		}
	}
}
