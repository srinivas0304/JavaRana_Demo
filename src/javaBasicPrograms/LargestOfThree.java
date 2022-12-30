package javaBasicPrograms;

public class LargestOfThree 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=121;
		int num3=15;
		
		int result=((num1>num2)?num1:num2);
		
		int output=((result>num3)?result:num3);
		
		System.out.println(output);
	}
}
