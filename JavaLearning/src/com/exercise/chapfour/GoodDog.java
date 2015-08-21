package com.exercise.chapfour;

public class GoodDog {
	
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	void bark()
	{
		if(getSize() > 60)
		{
			System.out.println("Woof! Woof!");
		}
		else if(getSize() > 14)
		{
			System.out.println("Ruff! Ruff!");
		}
		else
		{
			System.out.println("Yip! Yip!");
		}
			
	}

}
