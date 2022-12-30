package constructorConcept;

public class Marks 
{
	int result;
	public Marks(int marks)
	{
		result=marks;
	}
	
	public void displayResult()
	{
		System.out.println("Final marks of a Student: "+result);
	}
	
	public static void main(String[] args) 
	{
		Marks m=new Marks(454);
		m.displayResult();
	}
}
