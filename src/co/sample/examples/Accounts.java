package co.sample.examples;

import java.math.BigInteger;

public class Accounts {
long accno;
String name;
double balance;
String ifsc;
	 
	Accounts (long accno,String name, double balance, String ifsc)
	{
		//assigning local variables to global
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		this.ifsc=ifsc;
	}
	public void display ()
	{
		System.out.println("Account number: "+accno);
		System.out.println("Account holdername: "+name);
		System.out.println("Account balance: "+balance);
		System.out.println("Branch ifsccode: "+ifsc);
	}
}
