// 2
// Without using class and object perform factorial 

import java.io.*;
import java.util.Scanner;

class Factorial_TCI1_2 
{
    static 
	{
        	System.out.println("TOFIK MULTANI");
        	System.out.println("MCA");
        	System.out.println("Roll : 35");
   	}

   public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a Number : ");
        	int n = sc.nextInt();

        	long fact = 1;
        	for (int i = 1; i <= n; i++) 
		{
            		fact = fact * i;
        	}

        	System.out.println("Factorial of " + n + " is: " + fact);

        
    	}
}
