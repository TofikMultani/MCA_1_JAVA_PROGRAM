import java.util.Scanner;

interface Bank 
{
    void rateOfInterest(float principleamount, float time);
    void calculate();
}

class RateOfInterest implements Bank 
{
    	float principleamount, time, rate, si;
	Scanner sc = new Scanner(System.in);

    	 public void rateOfInterest(float principleamount, float time) 
	{	
		System.out.print("Enter 1 for SBI \n\n Enter 2 for HDFC \n\n Enter 3 for ICICI");
		int num = sc.nextInt();
		
 		if (num == 1) 
		{
            		rate = 7.50f;
        	} 
		else if (num == 2) 
		{	
            		rate = 6.60f;
        	} 
		else 
		{
            		rate = 6.05f;
        	}	

        	this.principleamount = principleamount;
        	this.time = time;
    	}

        public void calculate() 
	{
        	si = (principleamount * time * rate) / 100;
        	System.out.println("\nSimple Interest is: " + si);
		System.out.print("\nTotal amount is:"+(si+principleamount));
    	}
}

public class Bankk 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);	

        	System.out.print("\nEnter principal amount: ");
        	float principleamount = sc.nextFloat();

        	System.out.print("\nEnter time: ");
        	float time = sc.nextFloat();

               	RateOfInterest ri = new RateOfInterest();
        	ri.rateOfInterest(principleamount,time);
        	ri.calculate();
    	}
}
