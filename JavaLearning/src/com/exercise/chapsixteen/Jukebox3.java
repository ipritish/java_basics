package com.exercise.chapsixteen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Jukebox3 {

	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		new Jukebox3().go();

	}
	
	class ArtistCompare implements Comparator<Song>{
		public int compare(Song one, Song two)
		{
			return one.getArtist().compareTo(two.getArtist());
		}
	}
	
	public void go(){
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		System.out.println(songList);
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
		TreeSet<Song> songTSet = new TreeSet<Song>();
		songTSet.addAll(songList);
		System.out.println(songTSet);
	}
	
	void getSongs(){
		try {
			File file = new File("SongListMore.txt");
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
		Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
		songList.add(nextSong);
	}

}
