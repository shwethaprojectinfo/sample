package co.sample.examples;
   class ArithmeticOperationn  
	{  
	public void addition(int a, int b)  
	{  
	int sum = a + b;  
	System.out.println("Addition of the numbers " + a + " and " + b + " is: " + sum);  
	}      
	}  
	class CharacterOperation  
	{  
	public void findingVowel(char c)  
	{  
	switch(c)  
	{  
	case 'a':  
	case 'e':  
	case 'i':  
	case 'o':  
	case 'u':  
	    System.out.println(c + " is a vowel.");  
	break;  
	default:  
	   System.out.println(c + " is not a vowel.");  
	}  
	}
	public static void main(String argvs[])  
	{  
	int a = 9;  
//	int b = 46;  
//	char c = 'z';  
	char d = 'p';  
	// creating an object of the class ArithmeticOperation  
	ArithmeticOperationn obj = new ArithmeticOperationn();  
	// creating an object of the class CharacterOperation  
	CharacterOperation obj1 = new CharacterOperation();  
	obj.addition(10, 5);  
	obj1.findingVowel('a');  
	obj1.findingVowel('p');  
	}  
	}  
	 
public	class ArithmeticOperation{
		
		public static void main(String args[])  
		{  

		// creating an object of the class ArithmeticOperation  
		ArithmeticOperationn obj = new ArithmeticOperationn(); 
		obj.addition(8, 6);  
//		// creating an object of the class CharacterOperation  
//		CharacterOperation obj1 = new CharacterOperation();  
//		
//		obj1.findingVowel('c');  
//		obj1.findingVowel('d');  
//		}  
		
	}}
	

