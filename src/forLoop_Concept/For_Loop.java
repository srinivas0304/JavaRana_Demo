package forLoop_Concept;

public class For_Loop
{
	public static void main(String[] args) 
	{
		int num=20;
		int j;
		for(int i=1;i<=num;i+=2)
		{
			for(j=1;j<=num;j++)
			{
				System.out.println(i+" "+j);
			}
		}
	}
}
