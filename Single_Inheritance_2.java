// Single Inheritance  
// Inheritance + Constructor + super key word 

import java.io.*;
class Warehouse //parents /base/super class
{
	int num;
	Warehouse(int num)
	{
		this.num=num;
	}	
}

class shop extends Warehouse  // child / derived / sub class
{
	shop(int num)
	{
		super(num);
	}
	void show()
	{
		System.out.println(num);
	}
}

class Single_Inheritance_2
{
	public static void main(String args[])
	{
		//warehouse w=new warehouse(10);
		shop s = new shop(10);
		s.show();
	}
}