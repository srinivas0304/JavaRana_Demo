package arrays;

import java.util.Arrays;

public class ReferenceTypeValueType 
{
	public static void main(String[] args) 
	{
//		int myIntegerValue=10;
//		int anotherIntegerValue=myIntegerValue;
//		
//		System.out.println("myIntegerValue= "+myIntegerValue);
//		System.out.println("anotherIntegerValue= "+anotherIntegerValue);
//		
//		anotherIntegerValue++;
//		
//		System.out.println("myIntegerValue= "+myIntegerValue);
//		System.out.println("anotherIntegerValue= "+anotherIntegerValue);
		
		
		int[] myIntArray=new int[5];
		int[] anotherArray=myIntArray;
		
		System.out.println("myIntegerValue= "+Arrays.toString(myIntArray));
		System.out.println("anotherIntegerValue= "+Arrays.toString(anotherArray));
		
		anotherArray[0]=12;
		
		System.out.println("after change myIntegerValue= "+Arrays.toString(myIntArray));
		System.out.println("after change anotherIntegerValue= "+Arrays.toString(anotherArray));
		
		anotherArray=new int[] {1,2,3,4,5};
		modifyArray(myIntArray);
		
		System.out.println("after modify myIntegerValue= "+Arrays.toString(myIntArray));
		System.out.println("after modify anotherIntegerValue= "+Arrays.toString(anotherArray));
		
	}
	
	public static void modifyArray(int[] arr)
	{
		arr[0]=10;
		arr=new int[] {5,2,6,4,9};
	}
}
