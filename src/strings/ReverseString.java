package strings;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		String rev="";
		
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
				
	}
}
