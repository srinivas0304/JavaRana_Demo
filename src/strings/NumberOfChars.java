package strings;

import java.util.Scanner;

public class NumberOfChars 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		//String s1=" ";
		int count=0;
		//String s1="[a-zA-Z0-9]";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of chars in given string is: "+s+"count: "+count);
	}
}
