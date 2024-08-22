package co.sample.examples;

	class OuterClass {
		  int x = 10;

		 public  class InnerClass {
		    int y = 5;
		  }
		}

		public class Main {
		  public static void main(String[] args) {
		    OuterClass myOuter = new OuterClass();
		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.y + myOuter.x);
		  }

		public void start() {
			// TODO Auto-generated method stub
			
		}

		public boolean isAlive() {
			// TODO Auto-generated method stub
			return false;
		}
		}


