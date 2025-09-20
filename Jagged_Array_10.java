import java.util.Scanner; 
class Jagged_Array_10 { 
   static  
   	 {    
        	System.out.println("TOFIK MULTANI");
        	System.out.println("MCA");
        	System.out.println("Roll : 35"); 
    	}

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int[][] a = new int[3][]; 
        a[0] = new int[2]; 
        a[1] = new int[3]; 
        a[2] = new int[4]; 
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                System.out.print("Enter value for a[" + i + "][" + j + "] : "); 
                a[i][j] = sc.nextInt(); 
            } 
        } 
        System.out.println("The entered values are : "); 
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                System.out.println("Value of a[" + i + "][" + j + "] : " + a[i][j]); 
            } 
        }   
    } 
}