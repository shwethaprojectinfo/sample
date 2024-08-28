package logicalProgramms;

public class NonReapetadcharacterInArray {

	public static void main(String[] args) {
		String s1 ="HELLOWORLD";
		char[]ch=s1.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
    	  if(s1.indexOf(ch[i])==s1.lastIndexOf(ch[i]))
    	  {
    		  System.out.println(ch[i]);
    	
    	  }
        
	}

	}

}
