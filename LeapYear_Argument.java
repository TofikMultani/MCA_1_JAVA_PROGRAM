// leap year 

import java.io.*;

class LeapYear_Argument
{
	static 
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("MCA");
		System.out.println("Roll : 35");
	}
	static public void main(String t[])
	{
		int year;
		year=Integer.parseInt(t[0]);

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