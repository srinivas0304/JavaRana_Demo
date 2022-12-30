package tryCatch;

public class Test 
{
	public static void main(String[] args) throws ArithmeticException
	{
		System.out.println("stsmnt1");
		
		
		try
		{
			System.out.println(10/0);//This is the normal termination and it is the graceful termination  
		}
		catch(ArithmeticException e)
		{
			//System.out.println(10/2);
			//e.getStackTrace();
			//e.printStackTrace();//java.lang.ArithmeticException: / by zero at tryCatch.Test.main(Test.java:12)
			//System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
			
			System.out.println(e.getMessage());
		}
	//	System.out.println("statm2");
	}
}
