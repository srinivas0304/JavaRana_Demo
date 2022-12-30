package collections;

import java.util.Collection;
import java.util.HashMap;

public class Continent
{
	public static void main(String[] args)
	{
		HashMap<String, String> countries=new HashMap<>();
		
		countries.put("England", "Europe");
		countries.put("India", "Asia");
		countries.put("China", "Asia");
		countries.put("USA", "North America");
		
		//get the values of countries hashmap
		
		Collection<String> vals=countries.values();
		
		//create a new hashmap to count countries in continent
		
		HashMap<String, Integer> continent=new HashMap<>();
		for(String value:vals)
		{
			continent.put(value,continent.getOrDefault(value, 0) +1);
		}
		
		//print continent hashmap
		
		System.out.println(continent);
	}
}
