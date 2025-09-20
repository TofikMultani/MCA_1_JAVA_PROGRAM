// Hierarchical Inheritance

class A 
{
	void methodA()
	{
		System.out.println("Call Method A...");

	}
}

class B extends A
{
	void methodB()
	{
		System.out.println("Call Method B...");

	}
}

class C extends A
{
	void methodC()
	{
		System.out.println("Call Method C...");

	}
}

class D extends A
{
	void methodD()
	{
		System.out.println("Call Method D...");

	}
}

class Hierarchical_Inheritance
{
	public static void main(String args[])
	{
		A a = new A();
        	a.methodA(); // From Class A

        	B b = new B();
        	b.methodA(); // Inherited from A
        	b.methodB(); // From Class B

        	C c = new C();
        	c.methodA(); // Inherited from A
        	c.methodC(); // From Class C

        	D d = new D();
        	d.methodA(); // Inherited from A
        	d.methodD(); // From Class D

	}
}