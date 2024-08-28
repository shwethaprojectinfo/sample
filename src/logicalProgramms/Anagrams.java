package logicalProgramms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
	    String str1 = "heart";
	    String str2 = "earth";
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
	    
	    if(str1.length() == str2.length()) {

	      char[] ch1 = str1.toCharArray();
	      char[] ch2 = str2.toCharArray();
	      Arrays.sort(ch1);
	      Arrays.sort(ch2);
	      String A1=new String(ch1);
	      String A2=new String(ch2);

	   
	      if(A1.equals(A2)) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	        
	  }

}
