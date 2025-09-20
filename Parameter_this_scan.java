//Example Parameter using this key word
// Scanner used

import java.io.*;
import java.util.Scanner;

class emp
{
	int empid;
	float s;

	emp()
	{
		
	}

	emp(int empid, float s)
	{
		this.empid=empid;
		this.s=s;
	}
	void dis()
	{
		System.out.println("Emp Id :"+ empid +"\n"+ "Salary :"+ s);
	}
}

class Parameter_this_scan
{
	public static void main(String[] args)
	{
		
	Scanner sc= new Scanner(System.in);
	
	int empid;
	float s;
	
	System.out.print("Enter EmpId :");
	empid=sc.nextInt();

	System.out.print("Enter Salary :");
	s=sc.nextFloat();

		emp e=new emp();
		emp e1=new emp(23,45.25f);
		e1.dis();
	}
}
