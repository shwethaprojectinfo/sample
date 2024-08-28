package logicalProgramms;

import java.util.Scanner;

public class NaturalNumbers {
        
	public static void main(String[] args) {
	   Scanner  s=new Scanner(System.in);
     System.out.println("Enter the N value");
     int n=s.nextInt();
     int i=1;
     int sum=0;
     while(i<=n)
     {
     	sum=sum+i;
     	i++;
     }
     System.out.println(sum);
	}

}
