import java.io.*;
import java.util.Scanner;

class LeapYearCheck {
		
		static
		{
			System.out.println("TOFIK MULTANI");
			System.out.println("Roll No : 35");
			System.out.println("Branch : MCA");
		}

    		static public void main(String[] args) 
		{
        		Scanner sc = new Scanner(System.in);
			
			int year;

        		System.out.print("Enter a year: ");
        		year = sc.nextInt();

        		if (year % 4 == 0) 
				{
            				if (year % 100 == 0) 
					{
                				if (year % 400 == 0) 
						{
                    					System.out.println(year + " is a Leap Year");
                				} 
						else 
						{
                    					System.out.println(year + " is NOT a Leap Year");
                				}
            				} 
					else 
					{
                				System.out.println(year + " is a Leap Year");
            				}
        			}	 
			else 
				{
            				System.out.println(year + " is NOT a Leap Year");
       				}
    }
}
