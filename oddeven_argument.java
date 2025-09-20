//Odd Even

import java.io.*;
class oddeven_argument

{
	static 
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("MCA");
		System.out.println("Roll : 35");
	}
	static public void main(String t[])
	{
		int n;
		n=Integer.parseInt(t[0]);
		
		if(n%2==0)
		{
			System.out.println("Even :"+n);
		}
		else 
		{
			System.out.println("Odd :"+n);
		}
		
	}
}