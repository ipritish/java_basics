package com.exercise.chapthree;

public class DogArrayExample 
{
	String name;
	
	public void bark()
	{
		System.out.println(name + " says Ruff!");
	}
	
	public void eat()
	{
		
	}
	
	public void chaseCat()
	{
		
	}
	
	public static void main(String[] args) 
	{
		DogArrayExample dog1 = new DogArrayExample();
		dog1.name = "Bart";
		dog1.bark();
		
		DogArrayExample[] myDogs = new DogArrayExample[3];
		
		myDogs[0] = new DogArrayExample();
		myDogs[1] = new DogArrayExample();
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		myDogs[2] = dog1;
		
		int x = 0;
		for (x = 0;x<3; x++)
		{
			myDogs[x].bark();
			x = x+1;
		}
				
	}

}
