// parameterize

class student
{
	student(int roll,String name,float par)
	{
		System.out.println("Roll No :"+roll);
		System.out.println("Name :"+name);
		System.out.println("Percentage :"+par);
	}	
}

class Teacher_parameterize
{
	public static void main(String[] args)
	{		
		student t1 = new student(35,"TOFIK MULTANI",85);
	}
}