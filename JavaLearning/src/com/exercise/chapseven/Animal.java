package com.exercise.chapseven;

abstract public class Animal 
{
	public int picture;
	private String food;
	private int hunger;
	private String boundries;
	private String location;
	
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
