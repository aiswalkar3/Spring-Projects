package com.EECS.LooselyCoupled;

public interface MessageDisplayer {
	void setMessageGetter(MessageGetter getter);
	MessageGetter getMessageGetter();
	void displayMessage();
}
