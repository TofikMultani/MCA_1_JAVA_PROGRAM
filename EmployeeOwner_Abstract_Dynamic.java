/*
Create class name Employee , another class name Owner. 
you need to display client Id.
*/

import java.io.*;
import java.util.Scanner;

abstract class Owner
{
	int ClientId;
	abstract void dis();
}

class Employee extends Owner 
{
	Employee(int id)
	{
		ClientId=id;
	}
	
	void dis()
	{
		System.out.println("Client ID :"+ClientId);
	}
}

class EmployeeOwner_Abstract_Dynamic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Client Id :");
		int CID =sc.nextInt();

		Owner o = new Employee(CID);
		o.dis();
	}
}