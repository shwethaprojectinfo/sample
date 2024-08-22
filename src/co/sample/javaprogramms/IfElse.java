package co.sample.javaprogramms;

import java.util.Scanner;

public class IfElse { 

	public static void main(String[] args) {
		int marksObtained, passingmarks;
		
		passingmarks = 36;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input marks scored by you");
		
		marksObtained = input.nextInt();
		
		if(marksObtained >= passingmarks) {
			System.out.println("You passed the exam");
		}else {
			System.out.println("Unfortunately you failed to pass the exam.");
		}
	}
}
