import java.io.*;

class Prime_Array_1
{ 
        static 
	{ 
            	System.out.println("TOFIK MULTANI");
        	System.out.println("MCA");
        	System.out.println("Roll : 35"); 
        } 
        public static void main(String[] args) 
	{ 
            	int[] a = { 3, 35, 17, 29, 12, 28, 10, 13, 77, 7 }; 

        	boolean isPrime; 

            	for (int val : a) 
		{ 
                	isPrime = true; 
                	for (int i = 2; i <= val / 2; i++) 
			{ 
                    	if (val % i == 0) 
				{ 
                        		isPrime = false; 
                        		break; 
                   		} 
                	} 
                	if (isPrime == true) 
                    		System.out.println(val + " is a prime number"); 
            	} 
        } 
} 
