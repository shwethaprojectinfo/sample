package co.sample.examples;
	public class Main4 extends Thread {
		  public static void main(String[] args) {
		    Main thread = new Main();
		    thread.start();
		    System.out.println("This code is outside of the thread");
		  }
		  public void run() {
		    System.out.println("This code is running in a thread");
		  }
		}


