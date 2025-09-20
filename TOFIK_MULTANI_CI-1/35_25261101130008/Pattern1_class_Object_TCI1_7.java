//7 
//Triangle Pattern


import java.io.*;
import java.util.Scanner;


class Pattern 
{
    Scanner sc = new Scanner(System.in);
    int n,num;

        void input() 
	{
        	System.out.print("Enter number of rows: ");
        	n = sc.nextInt();
    	}

        void display() 
	{
        	for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    	}
}


class Pattern1_class_Object_TCI1_7 
{
    	static 
	{
        	System.out.println("TOFIK MULTANI");
        	System.out.println("MCA");
        	System.out.println("Roll : 35");
    	}

    	public static void main(String args[]) 
	{
        	Pattern p1 = new Pattern();
        	p1.input();

        	System.out.println("\n Triangle Pattern:");
        	p1.display();
    	}
}
