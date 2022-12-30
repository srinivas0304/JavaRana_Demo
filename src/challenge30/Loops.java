package challenge30;

public class Loops 
{
	public static void main(String[] args) 
	{
		//whileLoop();
		//forLoop();
		//doWhileLoop();
		//breakConce();
		//continueConce();
		continueForLoop();
	}
	
		public static void whileLoop()
		{
			int i=0;
			while(i<5)
			{
				System.out.println("Java");
				i=i+1;
			}
		}
		
		public static void forLoop()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Java");
			}
		}
		
		public static void doWhileLoop()
		{
			int i=0;
			do
			{
				System.out.println("Java");
				i=i+1;
			}
			while(i<5);
		}

		/*
		 * break --> loop will end 
		 * continue --> after continue keyword all the lines will be skipped
		 * Then it will check the condition
		 */
		public static void breakConce()
		{
			int i=0;
			while(i<5)
			{
				i=i+1;
				if(i==3)
				{
					break;
				}
				System.out.println(i);
			}
		}
		
		public static void continueConce()
		{
			int i=0;
			while(i<5)
			{
				i++;
				if(i==2)
				{
				continue;
				}
				System.out.println(i);//2 got skipped here
			}
		}
		
		public static void continueForLoop()
		{
			for(int i=0;i<5;i++)
			{
				if(i==2)
				{
					continue;
				}
				System.out.println(i);
			}
			System.out.println("After loop");
		}
}
