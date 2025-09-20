// Copy Constructer
import java.io.*;

class cons_copy
{
	int i;

	cons_copy() // defualt
	{
	}
	
	cons_copy(int i) //Parameter 
	{
		this.i=i;	
	}
	
	cons_copy(cons_copy t4)
	{
		i=t4.i;
		i++;
	}
	
	void show()
	{
		System.out.println(i);
	}
}

class Copy_Constructer
{
	public static void main(String[] args)
	{
		cons_copy t =new cons_copy();
		cons_copy t1 = new cons_copy(10);
		cons_copy t2 = new cons_copy(t1);
		t1.show();
		t2.show();
	}

}