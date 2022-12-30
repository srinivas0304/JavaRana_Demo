package classAndObject;

public class EmpDetails 
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.designation="Software engineer";
		
		Employee e1=new Employee();
		e1.eName="David";
		e1.eid=1254;
		e1.designation="Software Engineer";
		e1.salary=54000.023;
		e1.empd();
		e1.empName();
		e1.empId();
		e1.work();
		
		
		e1.empSalary();
	}
}
