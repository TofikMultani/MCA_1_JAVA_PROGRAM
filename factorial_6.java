import java.util.Scanner; 
class factorial_6
{ 
    static  
    { 
            System.out.println("TOFIK MULTANI");
            System.out.println("MCA");
            System.out.println("Roll : 35"); 
    } 

    int factorial(int n) { 
        if (n == 0 || n == 1) 
            return 1; 
        else 
            return n * factorial(n - 1); 
    } 

    public static void main(String[] args)  
    { 
        factorial_6 t = new factorial_6(); 

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a Number : "); 
        int n = sc.nextInt(); 

        // using recursion  
        System.out.println("using recursion Factorail : " + t.factorial(n)); 

        // using loop 
        if (n == 0) 
            System.out.println("using loop Factorail : 0"); 

   	int fact = 1; 

        for (int i = 1; i <= n; i++) 
            fact *= i; 
        System.out.println("using loop Factorail : " + fact); 

       
    } 
}