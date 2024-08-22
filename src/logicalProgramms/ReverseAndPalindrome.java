package logicalProgramms;

public class ReverseAndPalindrome {
	
	public static void main(String[] args) {
		int num = 12321;
		int rev=0;
		int temp=num;
		int rem;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Reversed Number is "+ rev);
		
		//Verify number is palindrome or not
		
		if(rev==temp) {
			System.out.println(rev +" is a palindrome");
		}
		else {
			System.out.println(rev +" is not a palindrome");
		}
		
	}

}
