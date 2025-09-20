import java.io.*;
import java.util.Scanner;

class IncrementDecriment3_2
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
	
		int i=3;
		
		System.out.println("Answer 1 :"+((++i) + (--i) - (i--) + (i++)));
		
	}
}