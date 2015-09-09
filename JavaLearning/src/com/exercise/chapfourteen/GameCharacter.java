package com.exercise.chapfourteen;

import java.io.Serializable;

public class GameCharacter implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2424959130049659331L;
	private int power;
	private String type;
	private String[] weapons;
	
	public GameCharacter(int p, String t, String[] w){
		power = p;
		type = t;
		weapons = w;		
	}
	
	public int getPower(){
		return power;
	}
	
	public String getType(){
		return type;
	}
	
	public String getWeapons(){
		String weaponsList = "";
		for(int i=0; i<weapons.length; i++)
		{
			weaponsList += weapons[i] + " ";
		}
		return weaponsList;
	}

}
