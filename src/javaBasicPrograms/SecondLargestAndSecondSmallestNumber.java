package javaBasicPrograms;

public class SecondLargestAndSecondSmallestNumber
{
	public static void main(String[] args)
	{
		int array[]= {25,31,91,12};
		int size=array.length;
		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		int res=array[size-=2];
		System.out.println("Second largest number: "+res);
		System.out.println("Second smallest number: "+array[1]);
	}
}
