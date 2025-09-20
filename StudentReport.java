/* Write a Program to demonstrate multiple inheritance using two inheritance Printable and Showable.

 Class Report Should Implement both and Calculate Grade of a student Dynamically (Mark Input , Grade Calculation Logic).

Condition  :- 
		Mark >= 90 -> Grade A
		Mark >= 75 -> Grade B
		Mark >= 60 -> Grade C
		Mark >= 40 -> Grade D
		Else -> Fail(F)
*/
import java.util.Scanner;

interface Printable 
{
    void mark();
}

interface Showable 
{
    void show();
}

class Report implements Printable, Showable 
{
    int mark;
    char grad;

    public void inputMark(int m) 
    {
        mark = m;
	
        if (mark >= 90) grad = 'A';
	
        else if (mark >= 75) grad = 'B';

        else if (mark >= 60) grad = 'C';

        else if (mark >= 40) grad = 'D';

        else grad = 'F';
	
    }

    public void mark() 
    {
        System.out.println("Mark: " + mark);
    }

    public void show() 
    {
        System.out.println("Grade: " + grad);
    }
}

class StudentReport 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Mark: ");
        int mk = sc.nextInt();

        Report r = new Report();
        r.inputMark(mk);
        r.mark();
        r.show();
    }
}