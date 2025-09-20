import java.io.*;
import java.util.Scanner;

class LargestNumber
{
		static
		{
			System.out.println("TOFIK MULTANI");
			System.out.println("Roll No : 35");
			System.out.println("Branch : MCA");
		}
	
		static public void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
	
			int a,b,c;
			
			System.out.print("Enter a First Number :");
			a=sc.nextInt();
	
			System.out.print("Enter a Second Number :");
			b=sc.nextInt();

			System.out.print("Enter a Third Number :");
			c=sc.nextInt();

			if(a>b)
			{
				if(b>c)
				{
					System.out.println("Largest Number Is A :"+a);
				}
				else
				{
					System.out.println("Largest Number Is C :"+c);
				}
			}
			else
			{
				if(a>c)
				{
					System.out.println("Largest Number Is B :"+b);
				}
				else
				{
					System.out.println("Largest Number Is C :"+c);

				}
			}
		
	}

}