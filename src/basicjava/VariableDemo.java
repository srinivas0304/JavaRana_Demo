package basicjava;

public class VariableDemo 
{	
	static int k=22;//global variable
	public static void main(String[] args) 
	{
		VariableDemo vd=new VariableDemo();
		vd.method1();
		vd.method2();
		System.out.println(k);
		
	}
	
	
	public void method1()
	{
		int num=11;
		System.out.println("The value of num is: "+num);
		
		System.out.println("The value of k: "+k);
	}
	
	public void method2()
	{
		//System.out.println("The value of num: "+num);
		
		System.out.println("The value of k: "+k);
	}
}
