package com.EECS.SpringAnnotationsDemo;

public interface MessageDisplayer {
	void setMessageGetter(MessageGetter getter);
	MessageGetter getMessageGetter();
	void displayMessage();
}
