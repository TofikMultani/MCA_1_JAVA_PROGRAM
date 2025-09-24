/*
Sport Interface

Write a program with interface Sport Having Method  getSportName().
Implement it in Cricket and Football.

Add Challenge : Add methods totalPlayers() that return number of players (11 for Cricket, 11 for Football)

*/

import java.util.Scanner;

interface Sports
{
	public void getSportName();
	public void totalPlayers();
}

class Football implements Sports
{
	public void getSportName()
	{
		System.out.println("Sport Name Is : FootBall");
	}
	
	public void totalPlayers()
	{
		System.out.println("Total Players : 11");
	}
	
}

class Cricket implements Sports
{
	public void getSportName()
	{
		System.out.println("Sport Name Is : Cricket");
	}
	
	public void totalPlayers()
	{
		System.out.println("Total Players : 11");
	}
}

class Sport_Interface
{
	public static void main(String args[])
	{
		Football f=new Football();
		f.getSportName();
		f.totalPlayers();

	
		Cricket c=new Cricket();
		c.getSportName();
		c.totalPlayers();	
	}
}