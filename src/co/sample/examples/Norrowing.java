package co.sample.examples;

public class Norrowing {
	public static void main(String[] args) {
		Father father;
		father = new Son();
		Son son = (Son) father;
		son.work();
		son.Play();
	}

}
