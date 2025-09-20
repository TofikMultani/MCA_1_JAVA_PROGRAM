// Copy Constructor
//Table Print 
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
		System.out.println("Enter Number :"+num);
	
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + " * " + i +" = " + (i*num));	
		}	
	}
}

class Copy_Constructer_Table
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