package constructorConcept;

public class Constructor_Concept 
{
	public Constructor_Concept()
	{
		System.out.println("From constructor");
	}
	
	public static void main(String[] args) 
	{
		Constructor_Concept cc=new Constructor_Concept();
		cc.display();
	}
	
	public void display()
	{
		System.out.println("from display method");
	}
	
}
