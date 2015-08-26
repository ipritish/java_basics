package com.exercise.chapeight;

public class Dog extends Canine implements Pet 
{
	
	public int doStuffOnlyDogCanDo(int ret)
	{
		return ret;
	}

	@Override
	public int rollandRun(String command) 
	{
		int retVal;
		if(command == "roll")
			retVal = 1;
		else
			retVal = 2;
		return retVal;
		
		
		
	}

}
