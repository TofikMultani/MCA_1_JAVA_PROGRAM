// take a integer value from keyboard gather than 10 less then 10 compare 

import java.io.*;
import java.util.Scanner;

class compare
{
	static
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("Roll No : 35");
		System.out.println("Branch : MCA");
	}

	static public void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.print("Enter Number :");
		n=sc.nextInt();

		if(n>10)
		{
			System.out.println(n + " Value Is  gather than 10 ");

		}
		else if (n==10)
		{
			System.out.println(n + " Value Is  Equal to 10 ");


		}
		else 
		{
			System.out.println(n + " Value Is Less than 10 ");

		}

	}

}