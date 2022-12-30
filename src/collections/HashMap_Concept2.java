package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Concept2
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(1, "Rohit");
		map.put(2, "David");
		map.put(3, "Roy");
		map.put(4, "Johny");
		map.put(5, "Morgan");
		map.put(6, "Wood");
		
		
		System.out.println("for loop ------------");
		for(int i:map.keySet())
		{
			System.out.println(i+" "+map.get(i));
		}
		
		System.out.println("for each loop---------");
		
		for(Map.Entry<Integer, String> set : map.entrySet())
		{
			System.out.println(set.getKey()+" "+set.getValue());
		}
		
		System.out.println("using Iterator---------");
		
		//Set s=map.keySet();
		Iterator <Entry<Integer, String>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> set1=(Map.Entry<Integer, String>) itr.next();
			System.out.println(set1.getKey()+" "+set1.getValue());
		}
	}
}
