// write in which used the concept of class and object ....Prime Or not

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
        	if (f <= 1) 
		{
            		System.out.println(f + " is NOT a Prime Number");
            		return;
        	}

        	boolean isPrime = true;
        	for (int i = 2; i <= f / 2; i++) 
			{
            			if (f % i == 0) 
				{
                			isPrime = false;
                			break;
            			}
        		}

        	if (isPrime) 
		{
            		System.out.println(f + " is a Prime Number");
        	} 
		else 
		{
            		System.out.println(f + " is NOT a Prime Number");
        	}
    	}

}
class Prime_class_Object_userDefine
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