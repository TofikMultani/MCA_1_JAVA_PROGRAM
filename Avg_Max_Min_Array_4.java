import java.util.Scanner; 
public class Avg_Max_Min_Array_4
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
        System.out.print("Enter number of students: "); 
        int size = sc.nextInt(); 
        int[][] marks = new int[size][4]; 
        for (int i = 0; i < marks.length; i++) 
        { 
            System.out.println("\nstudent " + (i + 1) + " : "); 
            for (int j = 0; j < marks[i].length; j++) 
            { 
                System.out.print("Enter marks of subject " + (j + 1) + " : "); 
                marks[i][j] = sc.nextInt(); 
            } 
        } 
        System.out.println("\nStudent Marks: "); 
        int max, min, avg; 
        for (int i = 0; i < marks.length; i++) 
        { 
            max = marks[i][0]; 
            min = marks[i][0]; 
            avg = 0;   System.out.println("\nstudent " + (i + 1) + " : "); 
            for (int j = 0; j < marks[i].length; j++) 
            { 
                if (marks[i][j] > max) 
                    max = marks[i][j]; 
                if (marks[i][j] < min) 
                    min = marks[i][j]; 
                avg += marks[i][j]; 
            } 
            avg /= marks[i].length; 
            System.out.println("Max Marks : " + max); 
            System.out.println("Min Marks : " + min); 
            System.out.println("Avg Marks : " + avg); 
        } 
        sc.close(); 
    } 
}