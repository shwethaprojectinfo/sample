package co.sample.examples;

	class A1
	{
	private String name;	//data member "name" is declared private to implement loose coupling.


	public String getName()
	{
		if(name!=null)	//Checking a valid access to data member, name
			return name;
		else
			return "not initiaized";
	}

	public void setName(String s)
	{
		if (s==null)	//Checking a valid setting of data member, name
			System.out.println("You can't initialize name to a null");
		else 
			name = s;
	}
	}


	


