package tryCatch;

public class Throw_Keyword 
{
	static void nullPointer()
	{
		try
		{
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException n)
		{
			System.out.println("caughted inside the method");
			throw n;
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			nullPointer();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught is main. ");
		}
	}
}
