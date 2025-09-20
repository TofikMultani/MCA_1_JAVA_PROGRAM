import java.io.*;
import java.util.Scanner;

class EvenDivisibleBy5 
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
				int num;
        			System.out.print("Enter a number: ");
        			num = sc.nextInt();

        			if (num % 2 == 0) 
				{
            				if (num % 5 == 0) 
					{
                			System.out.println(num + " is Even and Divisible by 5");
           				} 
					else 
					{
                				System.out.println(num + " is Even but NOT divisible by 5");
            				}
        				} 
				else 
				{
            				System.out.println(num + " is NOT an Even number");
        			}
    			}
}
