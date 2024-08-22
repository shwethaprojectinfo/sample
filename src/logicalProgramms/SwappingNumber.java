package logicalProgramms;

public class SwappingNumber {
	public static void main(String[] args) {
		int a=100 ,b=200;
		System.out.println("Before swapping, a=" + a + " and b =" +b);
		//Swapping using three variables
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Swapping using three variables");
		System.out.println("After swapping, a=" + a + " and b =" +b);	
		
		//Swapping using three variables
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("Swapping using three variables");
		System.out.println("After swapping, a=" + a + " and b =" +b);
		//Swapping a and b using XOR
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Swapping a and b using XOR");
		System.out.println("After swapping, a=" + a + " and b =" +b);
	}

}
