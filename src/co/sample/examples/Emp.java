package co.sample.examples;

public class Emp {
	Integer id ;
	String name;
	Address address;
	
	public Emp(Integer id, String name, Address address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
		Address address1=new Address("bng","KA","india");  
		Address address2=new Address("tmk","KA","india");  
		  
		Emp e=new Emp(111,"varun",address1);  
		Emp e2=new Emp(112,"arun",address2);  
		      
		e.display();  
		e2.display();  
	
	

}
}

