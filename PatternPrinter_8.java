import java.io.*;
public class PatternPrinter_8 
{
    static  
    {    
        System.out.println("TOFIK MULTANI");
        System.out.println("MCA");
        System.out.println("Roll : 35"); 
    }
    public static void main(String[] args) 
    {
        int rows = 3;

        // Upper triangle of stars
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Middle line with numbers
        /*for (int i = 1; i <= rows; i++) 
        {
            System.out.print(" ");
        }*/
        for (int i = 1; i <= 7; i++) 
        {
            System.out.print(i);
        }
        System.out.println();

        // Lower triangle of stars
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
