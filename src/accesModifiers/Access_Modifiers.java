package accesModifiers;


class C1
{
	public int x=10;
	
	protected int y=25;
	
	int z=20;
	
	private int a=27;
	
	public void meth1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);		
	}
}


public class Access_Modifiers 
{
	public static void main(String[] args) 
	{
		C1 c=new C1();
		
		//c.meth1();
		
		System.out.println(c.x);
		
		System.out.println(c.y);
		
		System.out.println(c.z);
		
		//System.out.println(c.a);
	}
}
