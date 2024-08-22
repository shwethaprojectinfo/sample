package logicalProgramms;

public class CountOfDigits {
	public static void main(String[] args) {
		//TODO Auto-generated method sub
		long num=1234567890;
		int count=0,num2=1234567899;
		//1.by using while loop
		while (num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digits :"+ count);
		//2.Converting given number to string solution to count digits in an integer
		String result=Integer.toString(num2);//calculate the size of string
		System.out.println(+result.length());
	}

}
