package constructor_Overloading;

public class Student1 
{
	public static void main(String[] args) 
	{
		Student s=new Student("Srinivas",60.5);
		s.display();
		
		Student s1=new Student("Amith",75.7,76.87);
		s1.display();
		
		Student s2=new Student("Sumith", 87.98,65.57,71.32);
		s2.display();
	}
}
