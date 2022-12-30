package javaDemo1;

public class B 
{
	static int i;
	
	public static void start()
	{
		System.out.println(i);
		System.out.println(B.i);
	}
	
	static int j=50;
	
	public static void main(String[] args) 
	{
		start();
		B.i=100;
		B.start();
		System.out.println(B.j);
	}
}


