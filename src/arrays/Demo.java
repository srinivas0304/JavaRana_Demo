package arrays;

public class Demo
{
	public static void main(String[] args) 
	{
		/*
		 * int array[]=new int[10]; array[0]=101; array[1]=102; array[2]=103;
		 * array[3]=104; array[4]=105; array[5]=106; array[6]=107; array[7]=108;
		 * array[8]=109; array[9]=110;
		 * 
		 * System.out.println(array[0]); System.out.println(array[1]);
		 * System.out.println(array[2]); System.out.println(array[3]);
		 * System.out.println(array[4]); System.out.println(array[5]);
		 * System.out.println(array[6]); System.out.println(array[7]);
		 * System.out.println(array[8]); System.out.println(array[9]);
		 */
		
		//declare an array
		//datatypename[] arrayName; or datatypename arrayname[];
		
		//initialization of an array
		//arrayName=new datatypename[5];
		//combining declaration and initialization of an array
		//datatypename[] arrayname=new datatypename[size];
		//new keyword is used to allocate memory and size is length of array
		
		int[] num=new int[5];
		for(int s:num)
		{
			System.out.println(s);//0 0	0 0	0 is the output becasue we did not set values to array, so it prints the default values as zero
		}
		
		double[] d=new double[4];
		for(double f:d)
		{
			System.out.println(f);
		}
		
		
//		int arr[]= {10,20,30};
//		for(int x:arr)
//		{
//			System.out.println(x);
//		}
//		arr[2]=101;
//		System.out.println("Element at index 2 is: "+arr[2]);
		
	}
}
