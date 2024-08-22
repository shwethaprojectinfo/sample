package co.sample.examples;

import java.util.ArrayList;

public class ArrayListchange {
	public static void main(String[] args) {
		ArrayList<Integer> ch =new  ArrayList<Integer>();
		
		ch.add(1);
		ch.add(2);
		System.out.println("first values "+ch);
		
		ch.set(1, null);
		System.out.println("after changed value "+ ch);
		}

}
