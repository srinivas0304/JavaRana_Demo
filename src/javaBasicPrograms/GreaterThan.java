package javaBasicPrograms;

import java.util.Scanner;

public class GreaterThan 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		
		String result=((num1>num2)?("num1: "+num1+" is largest"):("num2: "+num2+" is largest"));
		
		System.out.println(result);
				
		
		//or
		//zint output=((num1>num2)?num1:num2);
		
		//System.out.println(output);
	}
}
