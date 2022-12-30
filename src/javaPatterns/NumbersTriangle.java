package javaPatterns;

import java.util.Scanner;

public class NumbersTriangle 
{
	public static void main(String[] args) 
	{
		
		System.out.println("enter number of rows");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=0;i<=rows;i++)
		{
			int num=1;
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print((num+k)+ " ");
			}
			
			System.out.println();
		}
	}
}
