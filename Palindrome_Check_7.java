import java.io.*;
public class Palindrome_Check_7 
{     
   static  
    { 
            System.out.println("TOFIK MULTANI");
            System.out.println("MCA");
            System.out.println("Roll : 35"); 
    } 
    public static void main(String[] args) 
    {     
        int num = 15;     
        int originalNum = num;     
        int reversedNum = 0;     
        while (num != 0) {     
            int digit = num % 10;     
            reversedNum = reversedNum * 10 + digit;     
            num /= 10;     
        }     
        if (originalNum == reversedNum) {     
            System.out.println(originalNum + " is a palindrome.");     
        } else {     
            System.out.println(originalNum + " is not a palindrome.");     
        }     
    }     
}