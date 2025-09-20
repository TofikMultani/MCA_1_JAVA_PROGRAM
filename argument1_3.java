// command line argument print name , roll no 

import java.io.*;

class argument1_3

{
	static 
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("MCA");
		System.out.println("Roll : 35");
	}
	static public void main(String t[])
	{
		int roll;
		String name;
		roll=Integer.parseInt(t[0]);
		System.out.println(roll);

		name=t[1];
		System.out.println("Name :"+name);
	}	
}