import java.io.*;

class PatternSimple1
{
	public static void main(String args[])
	
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=i;j++)
			{	
				System.out.print("*");
			}
			System.out.print("\n");	
		}
	}
}