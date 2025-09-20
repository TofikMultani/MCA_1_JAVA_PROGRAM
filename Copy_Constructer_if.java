// Copy Constructer
import java.io.*;

class cons_copy
{
	int roll;
	String name;
	float per;
	
	cons_copy() // default
	{
	}
	
	cons_copy(int roll, String name, float per) //Parameter 
	{
		this.roll=roll;
		this.name=name;
		this.per=per;	
	}
	
	cons_copy(cons_copy t4)
	{
		roll=t4.roll;
		name=t4.name;
		per=t4.per;
	
		
	}
	
	void show()
	{
		System.out.println("Roll No :" + roll + "\nName :" + name + "\nPercentage :"+ per);
	
		if(per>60)
		{
			System.out.println("First Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

class Copy_Constructer_if
{
	public static void main(String[] args)
	{
		cons_copy t =new cons_copy();

		//Parameter Constructer
		cons_copy t1 = new cons_copy(55,"Rakesh",70.23f);
	
		//Copy Constructer
		cons_copy t2 = new cons_copy(t1);
		//t1.show();
		t2.show();
	}

}