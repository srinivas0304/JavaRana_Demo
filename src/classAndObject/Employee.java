package classAndObject;

public class Employee 
{
	String eName;
	int eid;
	String designation;
	double salary;
	
	public void empName()
	{
		System.out.println("Name of an employee: "+this.eName);
	}
	
	public void empId()
	{
		System.out.println("Id number of an employee: "+this.eid);
	}
	
	public void empSalary()
	{
		System.out.println("Salary of an employee: "+this.salary);
	}
	
	public void work()
	{
		System.out.println("Designation of an employee: "+this.designation);
	}
	
	public void empd() 
	{
		System.out.println("Attending for a meeting by: "+this.eName+" "+this.eid+" "+this.designation+" "+this.salary);
	}
}
