// write in which used the concept of class and object ....Fibonacci series or not

import java.io.*;
import java.util.Scanner;

	
class Number
{
	Scanner sc=new Scanner(System.in);
	int f;
	
	void input()
	{
		System.out.print("Enter Number:");
		f=sc.nextInt();
	}

	void dis()
	{
	System.out.println(f);
	}
	
	void Check() 
	{
        	int a = 0, b = 1; 
        
        	while (a < f) 
		{   
            		int next = a + b;
            		a = b;
            		b = next;
        	}

        	if (a == f || f == 0) 
		{
            		System.out.println(f + " is in Fibonacci series");
        	} 
		else 
		{
            		System.out.println(f + " is NOT in Fibonacci series");
        	}
    	}

}
class Fibonacci_class_Object_userDefine
{
	static 
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("MCA");
		System.out.println("Roll : 35");
	}
	
	public static void main(String t[])
	{
		Number f1 = new Number();
		f1.input();
		f1.dis();
		f1.Check();
	}
}