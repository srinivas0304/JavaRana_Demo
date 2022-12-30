package challenge30;

public class Operators {
	public static void main(String[] args) 
	{
		// arithmeticOperators();
		//unaryOperators();
		//assignmentOp();
		//relationalOp();
		//logicalOp();
		ternaryOp();
	}

	public static void arithmeticOperators() 
	{
		float a = 14;
		float b = 3;
		float c = a % b;
		System.out.println(c);
	}

	public static void unaryOperators() 
	{
		//--i ---> Pre decrement //i-- -----> Post decrement
		//++i ---> Pre increment //i++ -----> Post increment
		int i = 8;
		int j = 2;
		//int k = --i + j;
		int k = (i--)+j;
		System.out.println(k);
	}
	
	public static void assignmentOp()
	{
		//=, +=, -=, *=, /=
		//a=b, a+=b --> a=a+b;
		
		int a = 25;
		int b = 2;
		a/=b;
		
		System.out.println(a);
		
	}
	
	public static void relationalOp()
	{
		//They tell you True/False
		// >, <, >=, <=, !=, ==
		int a = 10;
		int b = 5;
		System.out.println(a!=b);
	}
	
	public static void logicalOp()
	{
		//AND----> &&, OR-----> ||, NOT-------> !
		int a=2;
		int b=5;
		
		System.out.println((a!=b)&&(a==b));
		System.out.println((a!=b)||(a==b));
	}
	
	public static void ternaryOp()
	{
		int a=5;
		int b=9;
		
		int max = (a>b)?a:b;
		
		System.out.println(max);
	}
}
