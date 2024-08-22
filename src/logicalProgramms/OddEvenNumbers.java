package logicalProgramms;

import java.util.Scanner;

public class OddEvenNumbers {
	public static void main(String[] args) {
		//Using Brute Forcew Approach
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		if(num%2==0) {
			System.out.println(num + " is a even number");
		}
		else {
			System.out.println(num + " is a odd number");
		}
		
	}

}
