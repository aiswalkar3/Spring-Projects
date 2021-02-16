package com.EECS.LooselyCoupled;

public class HelloWorldLooselyCoupled {
	public static void main(String []args)
	{
		/*
		MessageGetter getter = new HelloWorldMessageGetter();
		MessageDisplayer displayer = new StandardOutputMessageDisplayer();
		displayer.setMessageGetter(getter);
		displayer.displayMessage();
		*/
		MessageSupportingFactory factory = MessageSupportingFactory.getMessageSupportingFactoryInstance();
		MessageGetter getter = factory.getMessageGetter();
		MessageDisplayer displayer = factory.getMessageDisplayer();
		displayer.setMessageGetter(getter);
		displayer.displayMessage();
	}
}
