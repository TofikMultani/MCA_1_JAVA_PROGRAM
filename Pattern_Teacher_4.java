// Member Function 
// EVEN
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
		for(int i=0;i<=10;i=i+2)
		{
			System.out.println(i);

		}
	}	
}

class Pattern_Teacher_4
{
	public static void main(String[] args)
	{	
		//student t= new student();
		student t;
		student t1 = new student();
		t1.input();
	}
}