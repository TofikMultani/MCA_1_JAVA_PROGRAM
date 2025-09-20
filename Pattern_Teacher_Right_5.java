// Member Function 
// Pattern Right
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
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}	
}

class Pattern_Teacher_Right_5
{
	public static void main(String[] args)
	{	
		
		student t1 = new student();
		t1.input();
	}
}