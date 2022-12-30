package switchcase_Concept;

public class Continue_Statement
{
	public static void main(String[] args) 
	{
		int num=10;
		for(int i=0;i<=num;i++)
		{
			if(i==5||i==9)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
