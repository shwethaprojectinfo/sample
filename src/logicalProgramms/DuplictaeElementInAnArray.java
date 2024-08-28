package logicalProgramms;

public class DuplictaeElementInAnArray {

public static void main(String[] args) {
		
		int []a= {10,20,10,25,20,35,50,35};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
		       {
		      	if(a[i]==a[j])
			     {
				     System.out.println(a[i]);
				     break;
			     }
		       }
		}
		
	}

}
