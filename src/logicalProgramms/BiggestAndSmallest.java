package logicalProgramms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		int []a= {10,25,35,15,40,20,57,86,46};
		Arrays.sort(a);
		System.out.println("The Smallest element in the array is :"+a[0]);
		System.out.println("The Biggest element in the array is :"+a[a.length-1]);
		

	  }

}
