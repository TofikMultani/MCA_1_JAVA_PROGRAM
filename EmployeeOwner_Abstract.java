/*
Create class name Employee , another class name Owner. 
you need to display client Id.
*/

import java.io.*;
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

class EmployeeOwner_Abstract
{
	public static void main(String args[])
	{
		Owner o = new Employee(15);
		o.dis();
	}
}