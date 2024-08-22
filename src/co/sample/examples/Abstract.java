package co.sample.examples;

public class Abstract {
		  static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }
		  public void myPublicMethod() {
		    System.out.println("Non-static methods must be called by creating objects");
		  }
		  public static void main(String[ ] args) {
		    myStaticMethod();
		    Abstract myObj = new Abstract();
		    myObj.myPublicMethod();
		  }
		}


