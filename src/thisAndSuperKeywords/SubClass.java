package thisAndSuperKeywords;

public class SubClass extends SuperClass
{
	public void printMethod()
	{
		super.printMethod();
		System.out.println("printed in sublcass");
	}
	
	public static void main(String[] args)
	{
		SubClass sc=new SubClass();
		sc.printMethod();
	}
}
