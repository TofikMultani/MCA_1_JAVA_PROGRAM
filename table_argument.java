// table of 7 

import java.io.*;
class table_argument
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
		int i=1;
		n=Integer.parseInt(t[0]);
		
		while( i<=10)
		{
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
	}
}