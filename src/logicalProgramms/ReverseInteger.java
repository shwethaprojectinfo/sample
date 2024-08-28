package logicalProgramms;

public class ReverseInteger {

	public static void main(String[] args) {
		int []a= {10,56,35,40,50};
		int start=0;
		int length=a.length-1;
		while(start<length)
		{
			int temp=a[start];
			a[start]=a[length];
			a[length]=temp;
			start=start+1;
			length=length-1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
				
		}

	}

}
