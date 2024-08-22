package co.sample.examples;
	import java.util.HashMap;
	public class Hashmap {

	public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.size();
	    
	    capitalCities.remove("England");
	    capitalCities.size();
	    for (String i : capitalCities.values()) {
	    	  System.out.println(i);
	
	  
	  }
	}
	}
