// Interface 

interface A
{
	void display1(); // abstract method(no body)
}

interface B
{
	void display2(); // abstract method(no body)
}


// Class implementing Interface
class Myclass implements A,B
{
	public void display1()
	{
		System.out.println("Display Method From Interface A");
	}
	
	public void display2()
	{
		System.out.println("Display Method From Interface B");
	}	
}


// Main Class 
class Interface_Simple
{
	public static void main(String[] args)
	{
		Myclass obj= new Myclass();
		obj.display1();
		obj.display2();
	}
}



