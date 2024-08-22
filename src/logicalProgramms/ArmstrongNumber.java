package logicalProgramms;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int sum = 0,res,temp;
		
		//(1*1*1)+(5*5*5)+(3*3*3)=153
		int num =153;//it is the number to check Armstrong
		temp=num;
		while(num>0) {
			res=num%10;
			num=num/10;
			sum=sum+(res*res*res);
		}
		if (temp==sum)
			System.out.println(temp +" is Armstrong number");
		else
			System.out.println(temp +" is Not Armstrong number");
		
	}

}
