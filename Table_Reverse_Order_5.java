import java.util.Scanner; 
class Table_Reverse_Order_5
{ 
   static  
        { 
            System.out.println("TOFIK MULTANI");
            System.out.println("MCA");
            System.out.println("Roll : 35"); 
        } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a Number : "); 
        int n = sc.nextInt(); 
        for (int i = 10; i > 0; i--) 
        {
            System.out.println(n + " X " + i + " = " + (n * i)); 
        }
        sc.close(); 
    } 
}