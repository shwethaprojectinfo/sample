package logicalProgramms;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		char ch='E';
		String s1="HELLOWORLDHELLOWORLD";
		char[]c=s1.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==ch)
			{
				count++;
			}
		}
		System.out.println("The count of character "+ch+" in :"+s1+"  is:"+count);

	}

}
