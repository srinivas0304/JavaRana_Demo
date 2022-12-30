package staticAndInstance;

public class StaticVarAndMethod
{
	int rollno;
	String sName;
	static String collegeName="Biet";
	
	StaticVarAndMethod(int rollno, String sName)
	{
		this.rollno=rollno;
		this.sName=sName;
	}
	
	static void change()
	{
		collegeName="Govt";
	}
	void display()
	{
		System.out.println(rollno+" "+sName+" "+collegeName);
	}
	public static void main(String[] args)
	{
		StaticVarAndMethod.change();
		StaticVarAndMethod s=new StaticVarAndMethod(401,"Rohit");
		StaticVarAndMethod s1=new StaticVarAndMethod(402,"Ishan");
		s.display();
		s1.display();
		
	}
}
