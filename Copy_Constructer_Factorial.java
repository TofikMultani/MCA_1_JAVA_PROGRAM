//factorial number
// Copy Constructor

import java.io.*;
import java.util.Scanner;

class cons_copy
{
	int num;
	
	cons_copy() // default
	{
	}
	
	cons_copy(int num) //Parameter 
	{
		this.num=num;	
	}
	
	cons_copy(cons_copy t4)
	{
		num=t4.num;	
	}
	
	void show()
	{
		int fact=1;
		System.out.println("Enter Number Facorial :"+num);
	
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}	
		System.out.println("Factorial :"+ fact);
	}
}

class Copy_Constructer_Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number :");
		int n=sc.nextInt();


		cons_copy t =new cons_copy();

		//Parameter Constructer
		cons_copy t1 = new cons_copy(n);
	
		//Copy Constructer
		cons_copy t2 = new cons_copy(t1);
		//t1.show();
		t2.show();
	}

}