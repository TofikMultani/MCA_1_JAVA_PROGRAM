import java.util.*;
class Palindrome_Array_3
{ 
     static  
        { 
            System.out.println("TOFIK MULTANI");
            System.out.println("MCA");
            System.out.println("Roll : 35"); 
        } 
    public static void main(String[] args) 
    { 
        int[] a = { 1, 2, 3, 4, 3, 2, 1 }; 
        boolean isPalindrome = true; 
        for (int i = 0; i < a.length / 2; i++) 
        { 
            if (a[i] != a[a.length - 1 - i]) 
            { 
                isPalindrome = false; 
                break; 
            } 
        } 
        if (isPalindrome) 
        { 
            System.out.println("The array is a palindrome : " + Arrays.toString(a)); 
        } 
        else 
        { 
            System.out.println("The array is not a palindrome : " + Arrays.toString(a)); 
        } 
    } 
}