package logicalProgramms;

class PrimeNumber {
	public static void main(String[] args) {
		int number = 31;
		int count = 0;
		if(number<=1) {
			System.out.println("The number is not a prime number");
			return;
		}
		for (int i=2;i<=number/2;i++) {
			if(number%i==0)
				count++;
		}
		if(count>1) {
			System.out.println("The number is not a prime number");
		}else {
			System.out.println("The number is prime number");
		}
	}

}
