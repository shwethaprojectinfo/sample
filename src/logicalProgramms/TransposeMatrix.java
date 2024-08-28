package logicalProgramms;

public class TransposeMatrix {

	public static void main(String[] args) {
		int [][] A= {{1,2,3},{4,5,6},{7,8,9}};
		int size=A.length;
		int [] [] Transpose=new int[size][size];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				Transpose[i][j]=A[j][i];
			}
		}
		System.out.println("Original Matrix");
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transposed Matrix");
		for(int i=0;i<Transpose.length;i++)
		{
			for(int j=0;j<Transpose.length;j++)
			{
				System.out.print(Transpose[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}
