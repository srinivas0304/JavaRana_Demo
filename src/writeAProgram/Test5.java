package writeAProgram;

public class Test5
{
	public static void main(String[] args)
	{
		int i=1;
		char ch1='a';
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+""+i++ +""+ch1++);
		}
	}
}
