package com.ratna.interfacee;

public class MainClass 
{
	public static void main(String[] args)
	{
	
		ITelephone tm;
		tm=new DeskPhone(990251007l);
		tm.powerOn();
		tm.dial(9902510067l);
		tm.callPhone(9902510067l);
		tm.answer();
		tm.isRinging();
		
	}
}
