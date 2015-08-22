package com.exercise.chapfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {

	public String getUserInput(String prompt) 
	{
		String inputLine = null;
		System.out.println(prompt + " ");
		try
		{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0)
				return null;
			
		}
		catch (IOException io)
		{
			io.printStackTrace();
		}
		return inputLine;
	}

}
