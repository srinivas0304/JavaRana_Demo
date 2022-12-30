package strings;

import java.util.Scanner;

public class RemoveCharAt 
{
	public static String removeCharAt(String s, int pos)
	{
		return s.substring(0,pos)+s.substring(pos+1);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println(removeCharAt(s, 11));
	}
}
