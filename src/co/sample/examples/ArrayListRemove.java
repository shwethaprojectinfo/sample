package co.sample.examples;

import java.util.ArrayList;

public class ArrayListRemove {
	public static void main(String[] args) {
		ArrayList<Character> cha = new ArrayList<Character>();
		cha.add('j');
		cha.add('j');
		cha.add('a');
		cha.add('v');
		cha.add('a');
		System.out.println(cha);
		
		cha.remove(0);
		System.out.println(cha);
		
		cha.removeAll(cha);
		System.out.println(cha);
	
		cha.add('j');
		System.out.println(cha);
		
		cha.add(1, 'a');
		System.out.println(cha);		
		}

}
