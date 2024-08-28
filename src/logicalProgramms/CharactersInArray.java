package logicalProgramms;

public class CharactersInArray {

	public static void main(String[] args) {
		char [] ch= {'1','A','3','4','E',' ','M'};
		int cvowel=0;
		int cdigit=0;
		int cspace=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U' ||
			       ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
		
				cvowel++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				cdigit++;
				
			}
			else if(ch[i]==' ')
			{
				cspace++;
			}
			
		}
		System.out.println("The count of vowels present in the array is :"+cvowel);
		System.out.println("The count of digits present in the array is :"+cdigit);
		System.out.println("The count of spaces present in the array is :"+cspace);



	}

}
