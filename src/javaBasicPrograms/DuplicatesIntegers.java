package javaBasicPrograms;

public class DuplicatesIntegers 
{
	public static void main(String[] args)
	{
		int[] arr= new int[]{2,5,4,4,2,6,5,3,8,9};
		
		System.out.println("Duplicate elements in given array: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
}
