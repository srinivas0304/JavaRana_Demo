package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList obj1=new ArrayList();
		obj1.add(12354);
		obj1.add(0, 12);
		obj1.add('M');
		obj1.add("Selenium_Java_Demo");
		//1. to print values 
		System.out.println("**************************************** 1");
		System.out.println(obj1);
		
		//2. To print values using for loop
		
		System.out.println("*****************************************2");
		int listSize=obj1.size();
		
		for(int i=0;i<listSize;i++)
		{
			System.out.println("Values from ArrayList: "+obj1.get(i));
		}
		//3. To print values using enhance for loop
		//here we no need to specify "int listSize=obj1.size();" this step
		System.out.println("***************************************** 3");
		for(Object bj:obj1)
		{
			System.out.println(bj);
		}
		System.out.println("**************************************** 4");
		
		Iterator itr=obj1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
