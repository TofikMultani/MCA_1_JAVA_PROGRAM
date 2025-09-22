// create class flower its has data member flower name, flower price  
// create a another class Lilly which extends all the property 
// create a display methods
// use a single inheritance and  super class

import java.io.*;
import java.util.Scanner;

class flower
{
	String fname;
	int fprice;
	flower(String fname,int fprice)
	{
		this.fname=fname;
		this.fprice=fprice;
	}

}

class Lilly extends flower 
{
	Lilly(String fname,int fprice)
	{
		super(fname,fprice);
	}
	
	void show()
	{
		System.out.println("\n Flower Name  :"+ fname +"\n Flower Price :"+fprice);
	}
}

class Flower_Shop
{
	public static void main(String args[])
	{
		Lilly l1=new Lilly("Rose",500);
		l1.show();
	}
}