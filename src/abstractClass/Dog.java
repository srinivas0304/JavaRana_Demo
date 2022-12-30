package abstractClass;

public class Dog extends Animal
{
	void sound()
	{
		System.out.println("barking");
	}
	
	public static void main(String[] args) 
	{
		Animal a=new Dog();
		a.sound();
	}
}
