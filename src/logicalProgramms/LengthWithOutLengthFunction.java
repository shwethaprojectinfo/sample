package logicalProgramms;

public class LengthWithOutLengthFunction {

	public static void main(String[] args) {
		String s="HELLO123456";
		char[]ch=s.toCharArray();
		int length=0;
		
		for(int i=0;i<ch.length;i++)
		{
			length++;
		}
		System.out.println("The length of String :"+s+" is "+length);
		

	}

}
