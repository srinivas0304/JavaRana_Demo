package forLoop_Concept;

public class Star2
{
	public static void main(String[] args)
	{
		int star=5;
		for(int i=0;i<=5;i++)
		{
			for(int j=star;j>=i;j--)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
}
