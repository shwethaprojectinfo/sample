package logicalProgramms;

public class RepeatedCharacterInArray {

	public static void main(String[] args) {
		String s="HELLO123WORLD";
		char[]ch=s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				     break;
				}
				
			}
		}
	 }

}
