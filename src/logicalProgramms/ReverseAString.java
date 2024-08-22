package logicalProgramms;

public class ReverseAString {
	public static void main(String[] args) {
		String str= "Shwetha";
		String s1="";
		//1.by using the charAt() method
		for(int i=str.length()-1;i>=0;i--) {
			s1=s1+str.charAt(i);//extracts each character and store in string
		}
		System.out.println("Reversed word :" + s1);
		//below is code to check weather given string is palindrome or not 
		if(str.equalsIgnoreCase(s1)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
		//2. Using built in rever() method of the StringBuilder class:
		String input = "welcome to java";
		StringBuilder input1= new StringBuilder();
		input1.append(input);
		input1.reverse();
	    System.out.println(input1);	
	    
	    //Using StringBuffer
	    String strText="java learning";
	    //conversion from string object to stringBuffer
	    StringBuffer sbr = new StringBuffer(strText);
	    sbr.reverse();
	    System.out.println(sbr);
	    
	}

     	
}
