package com.EECS.SpringDemo;

public interface MessageDisplayer {
	void setMessageGetter(MessageGetter getter);
	MessageGetter getMessageGetter();
	void displayMessage();
}
