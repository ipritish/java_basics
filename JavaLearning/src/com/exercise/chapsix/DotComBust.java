package com.exercise.chapsix;

import java.util.ArrayList;

public class DotComBust 
{
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame()
	{
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("Go2.com");
		DotCom three = new DotCom();
		three.setName("eToys.com");
		dotComList.add(one);
		dotComList.add(three);
		dotComList.add(two);
		
		System.out.println("Your Goal is to try and sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them in minimum guesses possible");
		
		for (DotCom  dotComToSet : dotComList)
		{
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying()
	{
		while(!dotComList.isEmpty())
		{
			String userGuess = helper.getUserInput("Enter a Guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) 
	{
		numOfGuesses++;
		String result = "miss";
		for (DotCom dotComToTest : dotComList)
		{
			result = dotComToTest.checkYourSelf(userGuess);
			if(result == "hit")
			{
				break;
			}
			if(result == "kill")
			{
				dotComList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame() 
	{
		System.out.println("All Dot Com are dead");
		System.out.println("It took you "+ numOfGuesses +" number of guesses");
	}
	
	public static void main(String[] args)
	{
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
