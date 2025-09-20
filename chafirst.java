// definition :- write a program to take 1 character form the user and check whether its equal to s.

import java.io.*;
import java.util.Scanner;

class chafirst
{
	static public void main(String args[])
	{
		char ch;
		char s='S';
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Character :");
		ch=sc.next().charAt(0);

		System.out.println(ch);

		if(ch==s)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}