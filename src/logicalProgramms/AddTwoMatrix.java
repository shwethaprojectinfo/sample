package logicalProgramms;

public class AddTwoMatrix {

	public static void main(String[] args) {
		int [] [] a= {{1,2,3},{1,2,3},{1,2,3}};
		int [] [] b= {{4,5,6},{4,5,6},{4,5,6}};
		int size1=a.length;
		int size2=b.length;
		int [] [] sum=new int [size1][size2];
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum.length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum.length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
