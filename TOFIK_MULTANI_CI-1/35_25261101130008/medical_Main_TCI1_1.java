//1
//write program in java class and object and scanner class. 
//your class name is medical and it hales data member serial number, customer id, Customer Name.
//fetch 5 records using for loop.

import java.io.*;
import java.util.Scanner;

class Medical 
{
    int sn, cid;
    String cname;

        void input(Scanner sc) {
        System.out.print("Enter Serial Number: ");
        sn = sc.nextInt();

        System.out.print("Enter Customer ID: ");
        cid = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name: ");
        cname = sc.nextLine();
    }

    
    void display() 
    {
        System.out.println("Serial Number : " + sn);
        System.out.println("Customer ID   : " + cid);
        System.out.println("Customer Name : " + cname);
        System.out.println("-------------------------");
    }
}

 class medical_Main_TCI1_1 
{
    static 
	{
        	System.out.println("TOFIK MULTANI");
        	System.out.println("MCA");
        	System.out.println("Roll : 35");
        }

    public static void main(String[] t) 
	{
        	Scanner sc = new Scanner(System.in);

        	Medical[] m = new Medical[5]; 

        
        	for (int i = 0; i < 5; i++) 
		{
            		System.out.println("Enter details for Customer " + (i + 1));
            		m[i] = new Medical();
            		m[i].input(sc);
        	}

        
        	System.out.println("\n--- Customer Records ---");
        	for (int i = 0; i < 5; i++) 
		{
            		m[i].display();
        	}
    	}
}
