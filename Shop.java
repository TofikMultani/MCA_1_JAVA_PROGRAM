// write in which used the concept of class and object ....7 name print fruits

import java.io.*;


class Fruits
{
	void dis()
	{
	System.out.println("\nKiwi"+"\nMango"+"\nApple"+"\nBanana"+"\nOrange"+"\nWatermelon"+"\nGuava");
	}
}
class Shop
{
	static 
	{
		System.out.println("TOFIK MULTANI");
		System.out.println("MCA");
		System.out.println("Roll : 35");
	}
	
	public static void main(String t[])
	{
		Fruits f1 = new Fruits();
		f1.dis();
	}
}