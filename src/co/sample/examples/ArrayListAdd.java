package co.sample.examples;

import java.util.ArrayList;

public class ArrayListAdd {
	public static void main(String[] args) {
		
   	ArrayList<Object> array = new ArrayList<>();
	 array.add("2");
	 array.add("3");
	 System.out.println(array);
	    
	 array.add(0, "1");
	 System.out.println(array);
	 
	 array.addAll(array);
	 System.out.println(array);
	 
//	 for(Object String : array){
//         
//         System.out.println(String);   
//         
         
       
	 
//	 array.addAll(8, array);
//	 System.out.println(array);
//	     
//  	 array.addAll(5, array);
//  	 System.out.println(array);

}
}
