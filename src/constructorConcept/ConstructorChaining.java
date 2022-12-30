package constructorConcept;

public class ConstructorChaining
{
	
	int rollno;
	String studentName;
	String schoolName;
	
	public ConstructorChaining(int rollno)
	{
		this.rollno=rollno;
	}
	public ConstructorChaining(int rollno, String studentName)
	{
		this(rollno);
		//this.rollno=rollno;
		this.studentName=studentName;
	}
	public ConstructorChaining(int rollno, String studentName, String schoolName)
	{
		this(rollno, studentName);
		this.schoolName=schoolName;
	}
	
	public static void main(String[] args) 
	{
		ConstructorChaining cc=new ConstructorChaining(112,"Foren","Forest");
		
		System.out.println(cc.rollno+" "+cc.studentName+" "+cc.schoolName);
	}
}
