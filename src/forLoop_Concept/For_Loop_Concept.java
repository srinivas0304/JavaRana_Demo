package forLoop_Concept;

public class For_Loop_Concept 
{
	public void square()
	{
		int star1=5;
		for(int i=1;i<star1;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pattern1()
	{
		int star2=5;
		for(int i=0;i<=star2;i++)
		{
			for(int j=i;j<=star2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void pattern2()
	{
		int star3=5;
		for(int i=1;i<=star3;i++)
		{
			for(int j=i;j<=star3;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void increasingTriangle()
	{
		for(int num=0;num<=4;num++)
		{
			for(int num1=0;num1<=num;num1++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void down()
	{
		int star=5;
		for(int i=0;i<=5;i++)
		{
			for(int j=star;j>=i;j--)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	
	}
	
	public void combine()
	{
		int star=5;
		for(int i=1;i<=star;i++)
		{
			for(int j=1;j<=star;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		For_Loop_Concept fc=new For_Loop_Concept();
		fc.square();
		System.out.println("---------------------------");
		fc.pattern1();
		System.out.println("---------------------------");
		// fc.pattern2();
		//System.out.println("---------------------------");
		//fc.increasingTriangle();
		//System.out.println("---------------------------");
		//fc.down();
		//fc.combine();
	}
}
