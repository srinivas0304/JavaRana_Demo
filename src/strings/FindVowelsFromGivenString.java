package strings;

import java.util.Scanner;

public class FindVowelsFromGivenString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String vowels=" ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels=vowels+ch;
				count++;
			}
		}
		System.out.println("The total number of vowels: "+count);
		System.out.println("The vowels from given String: "+vowels);
	}
}
