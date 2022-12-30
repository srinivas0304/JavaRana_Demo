package javaDemo1;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		String reverse = "";
		String num = sc.nextLine();
		int length = num.length();
		for (int i=length-1;i>=0;i--)
		{
			reverse = reverse + num.charAt(i);
			
		}
			if(num.equals(reverse))
			{
				System.out.println("The entered number is "+num+" Palindrome");
			}
			else
			{
				System.out.println("The entered number is "+num+" Not a Palindrome");
			}
	}
}
