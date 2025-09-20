import java.io.*;
import java.util.Scanner;

class MultiplicationTable
{
	static
		{
			System.out.println("TOFIK MULTANI");
			System.out.println("Roll No : 35");
			System.out.println("Branch : MCA");
		}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        System.out.println(num + " x 1 = " + (num*1));
        System.out.println(num + " x 2 = " + (num*2));
        System.out.println(num + " x 3 = " + (num*3));
        System.out.println(num + " x 4 = " + (num*4));
        System.out.println(num + " x 5 = " + (num*5));
        System.out.println(num + " x 6 = " + (num*6));
        System.out.println(num + " x 7 = " + (num*7));
        System.out.println(num + " x 8 = " + (num*8));
        System.out.println(num + " x 9 = " + (num*9));
        System.out.println(num + " x 10 = " + (num*10));
    }
}
