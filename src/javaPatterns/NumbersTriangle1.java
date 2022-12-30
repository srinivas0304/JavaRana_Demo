package javaPatterns;

import java.util.Scanner;

public class NumbersTriangle1 
{
	public static void main(String[] args) 
	{
		System.out.println("enter number of rows");
		 Scanner sc = new Scanner(System.in);
			int rows=sc.nextInt();
			int num = 1;
			int space=rows;
			for(int i=1;i<=rows;i++)
			{
				for(int j=1;j<space;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(num+" ");
					num++;
				}
				space--;
				System.out.println();
				
			}
		}
}
//		
//		Scanner sc = new Scanner(System.in);
//
//		// Taking noOfRows value from the user
//
//		System.out.println("How Many Rows You Want In Your Pyramid?");
//
//		int noOfRows = sc.nextInt();
//
//		// Initializing rowCount with 1
//
//		int rowCount = 1;
//
//		System.out.println("Here Is Your Pyramid");
//
//		// Implementing the logic
//
//		for (int i = noOfRows; i > 0; i--) {
//			// Printing i spaces at the beginning of each row
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//
//			// Printing 'j' value at the end of each row
//
//			for (int j = 1; j <= rowCount; j++) {
//				System.out.print(j + " ");
//			}
//
//			System.out.println();
//
//			// Incrementing the rowCount
//
//			rowCount++;
//		}
//	}
//}




