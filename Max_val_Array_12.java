import java.util.Scanner; 
class Max_val_Array_12 { 
      static  
   	 {    
        	System.out.println("TOFIK MULTANI");
        	System.out.println("MCA");
        	System.out.println("Roll : 35"); 
    	}

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int[][] a = {{15,25,37},{45,55,45,67},{75,97}}; 
        int max = a[0][0]; 
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                if (a[i][j] > max) { 
                    max = a[i][j]; 
                } 
            } 
        } 
        System.out.println("Maximum value is : " + max); 
            } 
}