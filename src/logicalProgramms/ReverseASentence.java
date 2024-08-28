package logicalProgramms;

import java.util.Scanner;

public class ReverseASentence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=s.nextLine();
		String[] str = s1.split(" ");
		String[] str1=rev(str);
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]+" ");
		}
	}
	public static String[] rev(String[] args)
	{
		for(int i=0;i<args.length;i++)
		{
			String s=args[i];
			String s2="";
			for(int j=0;j<s.length();j++)
			{
				s2=s.charAt(j)+s2;
			}
			args[i]=s2;
		}
		return args;
	}

}
