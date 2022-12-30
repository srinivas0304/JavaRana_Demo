package stringPrograms;

import java.util.Scanner;

public class Duplicate_Strings 
{
	public static void main(String[] args) 
	{
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s1.indexOf(s.charAt(i))==-1)
			{
				s1=s1+s.charAt(i);
			}	
		}
		System.out.println(s1);
		
	}
}
