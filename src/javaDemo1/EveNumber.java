package javaDemo1;

import java.util.Scanner;

public class EveNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The given number is even: "+num);
		}
		else 
		{
			System.out.println("The given number is not even: "+num);
		}
	}
}
