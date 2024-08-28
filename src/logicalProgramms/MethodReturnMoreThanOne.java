package logicalProgramms;

import java.util.Scanner;

public class MethodReturnMoreThanOne {
	public static int[] calculate(int a,int b)
	{
	int[] result = new int[4];
    result[0] = a + b;
    result[1] = a - b;
    result[2] = a * b;
    result[3] = a / b;
    return result;
	}
 
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    int a = sc.nextInt();
    System.out.println("Enter the value of b: ");
    int b = sc.nextInt();
    int[] result = calculate(a, b);
    
    System.out.println("Addition of "+a+" and "+b+": "+result[0]);
    System.out.println("Substraction of "+b+" from "+a+": "+result[1]);
    System.out.println("Multiplication of "+a+" and "+b+": "+result[2]);
    System.out.println("Division of "+a+" by "+b+": "+result[3]);
 }

}
