package com.exercise.chapfive;

public class SimpleDotCom 
{
	private int[] locationCells;
	private int numOfHits = 0;

	public void setLocationCells(int[] locations) 
	{
		locationCells = locations;
		
	}

	public String checkYourSelf(String stringGuess)
	{
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cell: locationCells)
		{
			if(guess == cell)
			{
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == locationCells.length)
		{
			result = "kill";
					
		}
		System.out.println(result);
		return result;
	}

}
