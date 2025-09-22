// Super Key used to call parent class 
// Super key word 

import java.io.*;
class A
{
	int a;
	A(int a)
	{
		this.a=a;
	}
}

class B extends A
{
	B(int a)
	{
		super(a);
	}
	
	void show()
	{
		System.out.println(a);
	}
}

class Super_Method_con
{
	public static void main(String args[])
	{
		B b1= new B(1000);
		b1.show();
	}
}
