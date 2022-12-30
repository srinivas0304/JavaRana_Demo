package javaDemo1;

public class MunnaBhai 
{
	static String location="Mirzapur";
	static 
	{
		System.out.println(location);
		MunnaBhai.location="UtterPradesh";
		System.out.println("Munnabhai actual location is: "+MunnaBhai.location);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello India..........!");
		System.out.println(location);
	}
}
