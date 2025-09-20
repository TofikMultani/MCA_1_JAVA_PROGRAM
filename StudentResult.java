import java.io.*;
import java.util.Scanner;

class StudentResult 
{
		static
			{
				System.out.println("TOFIK MULTANI");
				System.out.println("Roll No : 35");
				System.out.println("Branch : MCA");
			}


		
    		static public void main(String[] args) 
		{
        		Scanner sc = new Scanner(System.in);

			float m1,m2,m3;
			float avg;
	
        		System.out.print("Enter marks of Subject 1: ");
        		m1 = sc.nextFloat();

        		System.out.print("Enter marks of Subject 2: ");
        		m2 = sc.nextFloat();

        		System.out.print("Enter marks of Subject 3: ");
        		m3 = sc.nextFloat();

        		if (m1 >= 40 && m2 >= 40 && m3 >= 40) 
			{
            		avg = (m1 + m2 + m3) / 3;
			
			System.out.println("Avrage: "+avg);
        		

            			if (avg >= 60) 
				{
                			System.out.println("Result: Passed with Distinction");
            			} 
				else 
				{
                			System.out.println("Result: Passed");
            			}
        		} 
			else 
			{
            			System.out.println("Result: Failed");
        		}
    	}
}
