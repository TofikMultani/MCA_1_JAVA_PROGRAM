// write in which used the concept of class and object ....Odd Even

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
		if(f%2==0)
		{
			System.out.println("Even :"+f);
		}
		else 
		{
			System.out.println("Odd :"+f);
		}

	}

}
class OddEven_class_Object_userDefine
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