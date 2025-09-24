class A
{
	void displayA()
	{
		System.out.println("Class A...");
	}
}

class B extends A
{
	void displayB()
	{
		System.out.println("Class B...");
	}
}
class C extends B
{
	void displayC()
	{
		System.out.println("Class C...");
	}
}

interface D
{
	public void displayD();
	
}

class E extends C implements D
{
	public void displayE()
	{
		System.out.println("InterFace E...");
	}
	
	public void displayD()
	{
		System.out.println("InterFace D...");
	}
}

class Hybrid_Inheritance
{
	public static void main(String args[])
	{
		E t=new E();
		t.displayA();
		t.displayB();
		t.displayC();
		t.displayD();
		t.displayE();
	}
}