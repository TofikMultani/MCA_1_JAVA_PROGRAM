// Member Function 
// ODD
class student
{
	//Constructer
	student()
	{
		System.out.println("Name : TOFIK MULTANI");
	}
	
	// Member Function
	void input()
	{
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);

		}
	}	
}

class Pattern_Teacher_3
{
	public static void main(String[] args)
	{	
		//student t= new student();
		student t;
		student t1 = new student();
		t1.input();
	}
}