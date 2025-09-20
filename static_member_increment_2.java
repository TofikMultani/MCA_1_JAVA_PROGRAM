// Example Of static member and static Keyword 
// Counter increment  

import java.io.*;
//import java.util.Scanner;

class con_static
{
	int a=10;
	static int b=0;

	// Without static
	void show()
	{
		
		System.out.println("Without Static :"+ a);
		System.out.println("With Static :"+ b);
	}
	
	//With static
	static void show1()
	{
		//System.out.println("Without Static :"+ a);
		System.out.println("With Static without increment:"+ b);
		b++;
		System.out.println("With Static with increment:"+ b);
	}
}

class static_member_increment_2
{
	public static void main(String[] args)	
	{
		//Scanner sc= new Scanner(System.in);

		con_static t = new con_static();
		t.show();
		t.show1();
	}

}

