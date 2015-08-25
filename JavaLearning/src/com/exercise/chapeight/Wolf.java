package com.exercise.chapeight;

public class Wolf extends Canine 
{
	@Override
	public void eat() 
	{
		//super.eat();
		System.out.println("Wolf Eats!");
	}
	
	@Override
	public void makeNoise() 
	{
		//super.makeNoise();
		System.out.println("Woooo!!");
	}
}
