import java.io.*;
import java.util.Scanner;

class IncrementDecriment
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
		
		int i=2;
		
		System.out.println("Answer 1 :"+i);
		System.out.println("Answer 2 :"+(++i));
		System.out.println("Answer 3 :"+(i++));
		System.out.println("Answer 4 :"+((i++)+(++i)));
		System.out.println("Answer 5 :"+(--i));
		System.out.println("Answer 6 :"+(i--));
		//System.out.println("Answer 7 :"+((i--)+(--i)));
		System.out.println("Answer 8 :"+((i--)+(--i)+(++i)-(--i)*(i++)));
		
	}




}