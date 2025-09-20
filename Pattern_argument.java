// pattern 
import java.io.*;
class Pattern_argument
{
	static 
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("MCA");
		System.out.println("Roll : 35");
	}
	static public void main(String t[])
	{
		int n;
		n=Integer.parseInt(t[0]);
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");

		}
	}

}