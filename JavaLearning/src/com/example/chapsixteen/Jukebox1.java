package com.example.chapsixteen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Jukebox1 {

	ArrayList<String> songList = new ArrayList<String>();
	
	public static void main(String[] args) {
		new Jukebox1().go();

	}
	
	public void go(){
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
	
	void getSongs(){
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null)
			{
				addSong(line);
			}
			reader.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
	
	void addSong(String lineToParse){
		String[] tokens = lineToParse.split("/");
		songList.add(tokens[0]);
	}

}
