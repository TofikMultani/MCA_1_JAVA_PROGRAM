// Roll ,Name ,percentage using this key word

import java.io.*;
import java.util.Scanner;

class Student
{
	int roll;
	String name;
	float per;
	
	Student(int roll, String name, float per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	
	void dis()
	{
		System.out.println("\nStudent Details");
		System.out.println("Roll No :" + roll + "\n"+ "Name :" + name + "\n" + "Percentage :" + per);
	}
}

class Parameter_this_scan_Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int roll;
		String name;
		float per;
		
		System.out.print("Enter Roll No :");
		roll = sc.nextInt();
		sc.nextLine(); 

		System.out.print("Enter Name :");
		name = sc.nextLine();

		System.out.print("Enter Percentage :");
		per = sc.nextFloat();

		Student s=new Student(roll,name,per);
		s.dis();
	}
}