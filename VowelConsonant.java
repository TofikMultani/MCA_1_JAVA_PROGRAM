import java.io.*;
import java.util.Scanner;

class VowelConsonant 
{
	static
			{
				System.out.println("TOFIK MULTANI");
				System.out.println("Roll No : 35");
				System.out.println("Branch : MCA");
			}
    			public static void main(String[] args) 
			{
        			Scanner sc = new Scanner(System.in);
				char ch;
        			System.out.print("Enter a character: ");
        			ch = sc.next().toLowerCase().charAt(0);

        			if ((ch >= 'a' && ch <= 'z')) 
				{
            				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
					{
                				System.out.println(ch + " is a Vowel");
            				} 
					else 
					{
                				System.out.println(ch + " is a Consonant");
            				}
        			} 
				else 
				{
            				System.out.println("Invalid input! Please enter an alphabet.");
        			}
    			}
}
