package javaPatterns;

import java.util.Scanner;

public class Star_Triangle 
{
	public static void main(String[] args)
	{
		
		System.out.println("enter number of rows");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		//iterate for given number of rows
		int space=4,star=1;
		for(int i=1;i<=rows;i++)
		{
			//number of spaces before the star
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			// loop to print the number of stars in each row
			for(int k=1;k<=star;k++)
			{
				System.out.print(i);
			}
			star=star+2;
			space--;
			System.out.println();
		}	
	}
}
