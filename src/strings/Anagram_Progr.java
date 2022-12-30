package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Progr 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		System.out.println("Enter String s2");
		String s2=sc.nextLine();
		s2=s2.toLowerCase();
		
		
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Both strings are not anagram");
		}
		else
		{
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			
			
//			char[] temp=str1;
//			str1=str2;
//			str2=temp;
//			
//			str1=str1+str2;
//			s2=s1.substring(0,s1.length()-s2.length());
//			s1=s1.substring(s2.length());
			Arrays.sort(str1);
			Arrays.sort(str2);
			if(Arrays.equals(str1, str2)==true)
			{
				System.out.println("Both strings are anagram");
			}
			else
			{
				System.out.println("Both strings are not anagram");
			}
		}
	}
}
