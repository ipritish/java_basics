package com.exercise.chapfourteen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAFile {

	public static void main(String[] args) {
		
		try {
			File myFile = new File("MyFile.txt");
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			while((line = reader.readLine()) !=null)
			{
				System.out.println(line);
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
