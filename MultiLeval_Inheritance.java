class A 
{
	void methodsA()
	{
		System.out.println("Call Method A...");
	}
}
class B extends A
{
	void methodsB()
	{
		System.out.println("Call Method B...");
	}
}
class C extends B
{
	void methodsC()
	{
		System.out.println("Call Method C..");
	}
}

class MultiLeval_Inheritance
{
	public static void main(String []args)
	{
		C c=new C();
		c.methodsA(); //From Class A
		c.methodsB(); //From Class B
		c.methodsC(); //From Class C

		
	}
}