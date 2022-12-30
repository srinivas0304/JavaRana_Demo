package javaDemo1;

public class PatternA 
{
	public static void main(String[] args)
	{
		int num=10;
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=num/2;j++)
			{	
				//if ((j == 0 || j == num / 2) && i != 0 ||i == 0  && j != num / 2 ||i == num / 2)
				if((j==0||j==num/2)&&i!=0||i==0&&j!=num/2||i==num/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}
