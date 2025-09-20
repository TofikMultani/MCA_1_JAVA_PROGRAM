// write in which used the concept of class and object ....7 name print fruits

import java.io.*;
import java.util.Scanner;


class Fruits
{
	Scanner sc=new Scanner(System.in);
	String f;
	
	void input()
	{
		System.out.println("Enter Name:");
		f=sc.nextLine();
	}
	void dis()
	{
	System.out.println(f);
	}
}
class Shop_Userdefine
{
	static 
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("MCA");
		System.out.println("Roll : 35");
	}
	
	public static void main(String t[])
	{
		Fruits f1 = new Fruits();
		f1.input();
		f1.dis();
	}
}