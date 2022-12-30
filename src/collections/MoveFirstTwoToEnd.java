package collections;


import java.util.Arrays;
import java.util.Collections;

public class MoveFirstTwoToEnd 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4};
		Collections.rotate(Arrays.asList(arr),-2);
		
	}
}
