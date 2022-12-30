package arrays;

import java.util.Arrays;

public class ReverseArray
{
	public static void main(String[] args)
	{
		int [] array= {1,2,3,5};
		
		System.out.println("Array = "+Arrays.toString(array));
		
		reverse(array);
		
		System.out.println("Modified Array = "+Arrays.toString(array));
	}
	
	private static void reverse(int[] array)
	{
		int maxLength=array.length-1;
		int halfLength=array.length/2;
		for(int i=0;i<halfLength;i++)
		{
			int temp=array[i];
			array[i]=array[maxLength-i];
			array[maxLength-i]=temp;
		}
	}
}
