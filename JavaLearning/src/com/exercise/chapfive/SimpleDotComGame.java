package com.exercise.chapfive;

public class SimpleDotComGame {

	public static void main(String[] args) 
	{
		int numofGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		int randomNumber = (int) (Math.random()*5);
		
		int[] locations = {randomNumber,randomNumber+1,randomNumber+2};
		
		theDotCom.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while(isAlive)
		{
			String guess = helper.getUserInput("Enter a number");
			
			String result = theDotCom.checkYourSelf(guess);
			
			numofGuesses++;
			
			if(result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took " + numofGuesses + " guesses");
			}
		}

	}

}
