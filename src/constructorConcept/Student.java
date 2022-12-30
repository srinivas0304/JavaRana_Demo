package constructorConcept;

public class Student 
{
	String empName;
	int age;
	int marks;
	
	public Student()
	{
		System.out.println("From Constructor");
	}
	
	public Student(String empName)
	{
		System.out.println("From single parameter constructor");
		this.empName=empName;
	}
	public Student(int age,String empName)
	{
		System.out.println("From two parameter constructors");
		this.age=age;
		this.empName=empName;
	}
	
	public Student(String empName, int age, int marks)
	{
		System.out.println("From three parameter constructors");
		this.empName=empName;
		this.age=age;
		this.marks=marks;
	}
	
	public static void main(String[] args) 
	{
		Student s=new Student("Ade",21,85);
		
		Student s1=new Student(18,"Dev");
		
		System.out.println(s.empName+" "+s.age+" "+s.marks);
		
		System.out.println(s1.age+" "+s1.empName);
	}
}
