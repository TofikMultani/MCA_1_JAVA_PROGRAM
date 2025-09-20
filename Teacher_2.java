// Member Function
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
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);

		}
	}	
}

class Teacher_2
{
	public static void main(String[] args)
	{	
		//student t= new student();
		student t;
		student t1 = new student();
		t1.input();
	}
}