import java.io.*;

abstract class Flower 
{
	abstract void show();
}

class Lilly extends Flower
{
	void show()
	{
		System.out.println("Rose");
	}
}

class Abstract_Simple
{
	public static void main(String args[])
	{
		Flower f1 = new Lilly();
		f1.show();
	}
}