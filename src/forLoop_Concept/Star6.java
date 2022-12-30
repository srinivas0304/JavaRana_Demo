package forLoop_Concept;

public class Star6 
{
	public static void main(String[] args) 
	{
		int num=5;
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
