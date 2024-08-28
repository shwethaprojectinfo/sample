package logicalProgramms;

public class Palindrome {

	   public static void main(String[] args) {
			int n=1221;
			int original=n;
			int rev=0;
			while(n>0)
			{
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if(rev==original)
			{
				System.out.println(original+" is a palindrome number");
			}
			else
			{
				System.out.println(original+" is not a palindrome number");
			}

		  }

}
