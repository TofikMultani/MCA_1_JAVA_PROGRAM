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

class Flower_Shop_Dynamic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Flower Name :");
		String fname=sc.nextLine();

		System.out.print("Enter Flower Price :");
		int fprice=sc.nextInt();

		
		Lilly l1=new Lilly(fname,fprice);
		l1.show();
	}
}