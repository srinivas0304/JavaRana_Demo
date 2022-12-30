package constructors_Concept;

public class CarWithThisKeyword 
{
	String name;
	double topSpeed;
	int price;
	String modelNumber;
	
	public CarWithThisKeyword(String name, double topSpeed, int price, String modelNumber)
	{
		this.name=name;
		this.topSpeed=topSpeed;
		this.price=price;
		this.modelNumber=modelNumber;
	}
	
	public static void main(String[] args) 
	{
		CarWithThisKeyword car=new CarWithThisKeyword("Maruti",20.65,5,"110a");
		
		System.out.println(car.name+" "+car.topSpeed+" "+car.price+" "+car.modelNumber);
	}
}
