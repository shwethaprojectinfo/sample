package co.sample.examples;

public class CarEngine {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.price);
		c1.drive();
		System.out.println(c1.eng.cc);
		c1.eng.combustion();
	}

}
