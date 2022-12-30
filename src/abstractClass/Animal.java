package abstractClass;

abstract class Animal //abstract class
{
	abstract void sound();	//abstract method only declaration not {body} and after () ; is important
	
	void display()			//concrete method
	{
		System.out.println("i am from animal class");
	}
	
	Animal()
	{
		System.out.println("from Animal constructor");
	}
}
