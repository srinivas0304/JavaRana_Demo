package com.ratna.interfacee;

public class DeskPhone implements ITelephone 
{
	private long myNumber;
	private boolean isRinging;
	
	public DeskPhone(long myNumber)
	{
		this.myNumber=myNumber;
	}
	
	@Override
	public void powerOn() 
	{
		System.out.println("No action taken, desk phone does not have power button");
	}

	@Override
	public void dial(long phoneNumber)
	{
		System.out.println("Now ringing "+phoneNumber+" on deskphone");
	}

	@Override
	public void answer() 
	{
		if(isRinging)
		{
			System.out.println("Answering the deskphone");
		}
		else
		{
			isRinging=false;
			System.out.println("Unable to answer");
		}
	}
	@Override
	public boolean callPhone(long phoneNumber) 
	{
		if(phoneNumber==myNumber)
		{
			isRinging=true;
			System.out.println("Ring ring");
		}
		else
		{
			isRinging=false;
			System.out.println("Number is incorrect");
		}
		return isRinging;
	}
	
	@Override
	public boolean isRinging() 
	{
		return isRinging;
	}
}
