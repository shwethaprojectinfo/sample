package co.sample.examples;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("MI", 15000.0);
		Mobile m2 = new Mobile("onepluse",60000.0);
		Mobile m3 = new Mobile ("samsung");
		Mobile m4 = new Mobile ("55000.0");
		System.out.println(m1.brand+" "+m1.price);
	    System.out.println(m2.brand+" "+m2.price);
	    m3.displayDetails("iphone");
	    m4.displayDetails(60000.0);
	    
	    
		
	}

}
