import java.io.*;
import java.util.Scanner;

	
class result
{
	Scanner sc=new Scanner(System.in);
	double s1;
	double s2;
	double s3;
	double s4;
	double s5;
	
	double sum,avg;

	
	void input()
	{
		System.out.print("Enter a Mark 1:");
		s1=sc.nextDouble();
	
		System.out.print("Enter a Mark 2:");
		s2=sc.nextDouble();

		System.out.print("Enter a Mark 3:");
		s3=sc.nextDouble();
		
		System.out.print("Enter a Mark 4:");
		s4=sc.nextDouble();

		System.out.print("Enter a Mark 5:");
		s5=sc.nextDouble();
		
	}

	void dis()
	{
		System.out.println("Mark 1"+s1);
		System.out.println("Mark 2"+s2);
		System.out.println("Mark 3"+s3);
		System.out.println("Mark 4"+s4);
		System.out.println("Mark 5"+s5);
			
		sum = s1+s2+s3+s4+s5;
		System.out.println("Sum :"+sum);
		
		avg = sum/5;
		System.out.println("Avrage :"+avg);

		
		
	}
	
}
class Student_Class_Object
{
	static 
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("MCA");
		System.out.println("Roll : 35");
	}
	
	public static void main(String t[])
	{
		result f1 = new result();
		f1.input();
		f1.dis();
	}
}