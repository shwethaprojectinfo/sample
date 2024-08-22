package co.sample.examples;

public class Mobile {
	 String brand;
	 Double price;
	
	 Mobile(){
		}
	
	 Mobile (String brand, Double price)
	{
		this.brand=brand;
		this.price=price;
	}
  Mobile (String brand)
	{
		this.brand=brand;
	}
	Mobile (Double price)
	{
		this.price=price;
	}
 
	public void displayDetails(String brand)
 {
	 System.out.println("the brand name is : "+brand); 
 }

	public void displayDetails(Double price)
 {
	 System.out.println("the price is : "+price); 
 }
}
