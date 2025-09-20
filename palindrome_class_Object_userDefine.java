// write in which used the concept of class and object ....palindrome or not

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
        	int temp = f;
        	int rev = 0;

        	while (temp > 0) 
		{
            		int digit = temp % 10;
            		rev = rev * 10 + digit;
            		temp = temp / 10;
        	}

        	if (f == rev) 
		{
            		System.out.println(f + " is a Palindrome");
        	} 	
		else 
		{
            		System.out.println(f + " is NOT a Palindrome");
        	}
    	}

}
class palindrome_class_Object_userDefine
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