//Example Parameter using this key word

import java.io.*;
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

class Parameter_this
{
	public static void main(String[] args)
	{
		emp e=new emp();
		emp e1=new emp(23,45.25f);
		e1.dis();
	}
}
