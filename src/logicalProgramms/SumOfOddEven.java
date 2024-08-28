package logicalProgramms;

public class SumOfOddEven {

	public static void main(String[] args) {
		int n=1;
		int sumodd=0;
		int sumeven=0;
		while(n<=100)
		{
			if(n%2==0)
			{
				sumeven=sumeven+n;
			}
			else
			{
				sumodd=sumodd+n;
			}
			n++;
			
		}
		System.out.println("Sum of even numbers between 1 to 100 is :"+sumeven);
		System.out.println("Sum of odd numbers between 1 to 100 is :"+sumodd);


	}

}
