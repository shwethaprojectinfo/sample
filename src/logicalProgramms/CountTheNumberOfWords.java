package logicalProgramms;

import java.io.FileInputStream;

public class CountTheNumberOfWords {

	public static void main(String[] args) throws Exception {
        String path="C:\\Users\\kruth\\Downloads\\Java Programs.docx";
  
        
        FileInputStream fis=new FileInputStream(path);
        int size=fis.available();
        byte[] b1=new byte[size];
        fis.read(b1);
        for(int i=0;i<b1.length;i++)
        {
       	  System.out.print((char)b1[i]);
        }
        System.out.println();
        
        String a=new String(b1);
        int count=0;
        String[] s1=a.split(" ");
        for(int i=0;i<s1.length;i++)
        {
       	 count++;
       	 
        }
        System.out.println("Count of words is :"+count);
        
        }

}
