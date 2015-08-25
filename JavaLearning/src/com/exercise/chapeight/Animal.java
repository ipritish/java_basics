package com.exercise.chapeight;

public abstract class Animal 
{
	int picture;
	String food;
	int hunger;
	String boundries;
	String location;
	
	public void makeNoise()
	{
		System.out.println("Hallelujah!");
	}
	
	public void eat()
	{
		System.out.println("General Eatery");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping!");
	}
	
	public void roam()
	{
		System.out.println("Roams Straight");
	}
}
