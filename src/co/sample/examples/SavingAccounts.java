package co.sample.examples;

import java.math.BigInteger;

public class SavingAccounts extends Accounts{
	
	
	SavingAccounts(long accno,String name, double balance, String ifsc)
	{
		super (accno,name,balance,ifsc);
}
public void display()
		
{
	System.out.println("Account number: "+accno);
	System.out.println("Account holdername: "+name);
	System.out.println("Account balance: "+balance);
	System.out.println("Branch ifsccode: "+ifsc);
}
}
