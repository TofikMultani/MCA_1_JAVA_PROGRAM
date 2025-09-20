// Single Inheritance  

import java.io.*;
class Warehouse //parents /base/super class
{
	int id = 10;
}

class shop extends Warehouse  // child / derived / sub class
{
	void show()
	{
		System.out.println(id);
	}
}

class Single_Inheritance
{
	public static void main(String args[])
	{
		shop s = new shop();
		s.show();
	}
}