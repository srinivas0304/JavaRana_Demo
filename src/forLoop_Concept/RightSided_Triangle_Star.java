package forLoop_Concept;

public class RightSided_Triangle_Star 
{
	public static void main(String[] args)
	{
//		* * * * *  
//		* * * *   				  		
//		* * *    
//		* *     
//		* 
		
		//and
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		int star=5;
		for(int i=1;i<=star;i++)
		{
			for(int j=i;j<=star;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("");
			}
			System.out.println();
		}
	}
}
  