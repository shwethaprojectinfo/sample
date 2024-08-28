package logicalProgramms;

public class WithOutLoop {

	public static void main(String[] args) {
		print(1);

	}
	public static void print(int n)
	{
		if(n==101)
		{
			return;
		}
		System.out.println(n);
		n++;
		print(n);
	}

}
