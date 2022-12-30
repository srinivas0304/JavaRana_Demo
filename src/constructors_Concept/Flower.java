package constructors_Concept;

public class Flower 
{
	String fName;
	int noOfPettals;
	String color;
	
	public Flower(String fName, int noOfPettals, String color)
	{
		this.fName=fName;
		this.noOfPettals=noOfPettals;
		this.color=color;
		
		System.out.println(fName+" "+noOfPettals+" "+color);
	}
	
	public void pooja()
	{
		System.out.println("Flowers used for pooja: "+this.fName+" The number of pettals: "+noOfPettals+" The color of flowers: "+color);
	}
	
}
