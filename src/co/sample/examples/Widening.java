package co.sample.examples;

public class Widening {
	public static void main(String[] args) {
		Father father;
		father= (Father)new Son();
	    father.work();
	}

}
