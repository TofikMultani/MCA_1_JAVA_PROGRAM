//Positive negative

import java.io.*;
class PositiveNegative_argument
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
		
		if(n==0)
		{
			System.out.println("Not positive or not negative");
		}
		else if(n>0)
		{
			System.out.println(" Positive Number : "+n);

		}
		else 
		{
			System.out.println(" Negative Number : "+n);

		}
	}	

}