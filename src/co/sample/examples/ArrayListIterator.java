package co.sample.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("shwetha");
		str.add("kruthi");
		str.add(0, "anu");
		str.add(1, "manju");

		for (int i = 0; i < str.size(); i++) {
			  
            System.out.print(str.get(i) + " ");
            
            for (String string : str)
            System.out.println(string  +str);
            
            str.get(2);
            //System.out.println(str);
        }
	
	}

}
