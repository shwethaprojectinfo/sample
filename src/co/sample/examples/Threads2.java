package co.sample.examples;

public class Threads2 implements Runnable{
	public static void main(String[] args) {
		System.out.println("Hi");
	}
	public void run()
	{
		System.out.println("this code is running in a thread");
	}
}
