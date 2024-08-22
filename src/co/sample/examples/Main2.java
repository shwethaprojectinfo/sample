package co.sample.examples;

import co.sample.examples.OutClass.InnerClass;

class OutClass {
		  int x = 10;

		  class InnerClass {
		    public int myInnerMethod() {
		      return x;
		    }
		  }
		}

		public class Main2 {
		  public static void main(String[] args) {
		    OutClass myOuter = new OutClass();
		    InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.myInnerMethod());
		  }
		}



