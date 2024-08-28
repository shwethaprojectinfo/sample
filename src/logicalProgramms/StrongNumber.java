package logicalProgramms;

public class StrongNumber {
	
	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sum=0;
		while(n>0)
		{
		     int fact=1;
		     int rem=n%10;
		     while(rem>0)
		     {
		    	 fact=fact*rem;
		    	 rem--;
		     }
		     sum=sum+fact;
		     n=n/10;

	   }
		if(sum==temp)
		{
			System.out.println(temp+" is a strong number");
			
		}
		else
		{
			System.out.println(temp+" is not a strong number");
		}

 }


}
