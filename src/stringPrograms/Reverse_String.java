package stringPrograms;

import java.util.Scanner;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		
		for(int i=0; i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println("Reverse of given string is: "+rev);
	}
}
