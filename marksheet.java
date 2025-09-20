import java.io.*;
import java.util.Scanner;

class result 
{
	static
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("Roll No : 35");
		System.out.println("Branch : MCA");
	}
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double average;
        int subjects = 5;

        System.out.println("------------------");
        for (int i = 1; i <= subjects; i++) 
	{
            System.out.print("Enter a Mark of s" + i + " =");
            double mark = sc.nextDouble();
            total += mark;
        }

        average = total / subjects;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        if (average >= 40)
            System.out.println("Student is pass");
        else
            System.out.println("Student is fail");
    }
}
