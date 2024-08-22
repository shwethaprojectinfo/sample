package co.sample.examples;

public class Student {
		 String name; 
		 Integer rollNo;
		 Address address;
		 Integer pinCode;
			  
		public Student(String name, int rollNo, Address address) {  
		 this.rollNo = rollNo;  
		 this.name = name;  
		 this.address=address; 
		}  
		void display(){  
		 System.out.println("Name: " +name + ", "+"Roll no: " +rollNo);
		 System.out.println("Address:");
		 System.out.println(address.city+" "+address.state+" "+address.country); 
		 System.out.println("\n");
		}  
		public static void main(String[] args) 
		{  
		 Address addr1 = new Address("Dhanbad,","Jharkhand,","India");  
		 Address addr2 = new Address("Ranchi,","Jharkhand,","India");  
		 Student st1 = new Student("Deep", 05, addr1);  
		 Student st2 = new Student("John", 02, addr2);  
			     
		   st1.display();  
		   st2.display();  
		 }  
		}
			  


