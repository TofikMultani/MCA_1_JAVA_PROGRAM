import java.util.Scanner; 
class Stusubary_Jaggad_Array_11 { 
      static  
   	 {    
        	System.out.println("TOFIK MULTANI");
        	System.out.println("MCA");
        	System.out.println("Roll : 35"); 
    	}
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String[][] a = new String[3][]; 
        a[0] = new String[2]; 
        a[1] = new String[4]; 
        a[2] = new String[3]; 
        for (int i = 0; i < a.length; i++) { 
            System.out.println("Enter Subject for Student " + (i + 1) + " : "); 
            for (int j = 0; j < a[i].length; j++) { 
                System.out.print("Enter Subject " + (j + 1) + " : "); 
                a[i][j] = sc.nextLine(); 
            } 
        } 
        System.out.println("The entered Subject are : "); 
        for (int i = 0; i < a.length; i++) { 
            System.out.println("\nStudent " + (i + 1) + " : "); 
            for (int j = 0; j < a[i].length; j++) { 
                System.out.println("Subject " + (j + 1) + " : " + a[i][j]);    } 
        } 
        
    } 
}