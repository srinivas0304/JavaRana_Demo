package com.ratna.interfacee;

public interface ITelephone 
{
	void powerOn();
	void dial(long phoneNumber);
	void answer();
	boolean callPhone(long phoneNumber);
	boolean isRinging();
}
