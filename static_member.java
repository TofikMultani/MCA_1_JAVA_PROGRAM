// Example Of static member and static Keyword
// static can used in static function in 
import java.io.*;
class con_static
{
	int a=10;
	static int b=20;

	// Without static
	void show()
	{
		System.out.println("Without Static :"+ a);
		System.out.println("With Static :"+ b);
	}
	
	//With static
	static void show1()
	{
		//System.out.println("Without Static :"+ a);
		System.out.println("With Static :"+ b);
	}
}

class static_member
{
	
	public static void main(String[] args)	
	{
		con_static t = new con_static();
		t.show();
		t.show1();
	}

}

