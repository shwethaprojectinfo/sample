package co.sample.examples;
	import java.util.HashSet;

	public class Hashset {
	  public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    cars.contains("Mazda");
	    cars.remove("Volvo");
	    cars.clear();
	    System.out.println(cars);
	  }
	}


