package arrays;

import java.util.Scanner;

public class Demo1 
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]+=i;
		}
		printArray(arr);
//		for(int i=0;i<size;i++)
//		{
//			System.out.println("Element: "+i+", "+"value is: "+arr[i]);
//		}	
	}
	
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element "+i+", "+"Value is: "+arr[i]);
		}
	}
}
