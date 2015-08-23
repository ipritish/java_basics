package com.exercise.chapsix;

import java.util.ArrayList;

public class DotCom 
{
	private ArrayList<String> locationCells;
	private String name;
	public void setLocationCells(ArrayList<String> locations) 
	{
		locationCells = locations;
		
	}
	public void setName(String n)
	{
		name = n;
	}

	public String checkYourSelf(String userInput)
	{
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0)
		{
			locationCells.remove(index);
			
			if (locationCells.isEmpty())
			{
				result = "kill";
				System.out.println("Ouch you sunk "+ name + " :( ");
			}
			else
			{
				result = "hit";
			}
		}
		//System.out.println(result);
		return result;
	}

}
