package constructors_Concept;

public class Student 
{
	
	//class variables/instance variables
	String name;
	int rollno;
	long mobile;
	
	public Student()
	{
		System.out.println("default constructor");
	}
	
	public Student(int num)
	{
		System.out.println("1 parameter constructor");
		System.out.println(num);
	}
	
	public Student(int num, String name)
	{
		System.out.println("2 parameter constructor");
		System.out.println(num+" "+name);
	}
	
	public Student(String name, int rollno)//these are the local variables and we have to initilize values to the class variables
	{
		this.name=name;//this.class_Variable=local_Variable
		this.rollno=rollno;
		
		//System.out.println(name+" "+rollno);
	}
	
	public static void main(String[] args) 
	{
		
		Student s=new Student();
		
		Student s1=new Student(412);
		
		Student s2=new Student(007,"Dev");
		
		Student s3=new Student("Thomas Shelby",621);
		
		System.out.println(s3.name+" "+s3.rollno);
	}
}
