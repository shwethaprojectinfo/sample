package co.sample.examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("shwetha");
		str.add("kruthi");
		str.add(0, "anu");
		str.add(1, "manju");
		
	System.out.println(str);
	Collections.sort(str);
	System.out.println("after sorting "+str);
	
	Integer a = str.size();
	System.out.println(a);
	}
	

}
