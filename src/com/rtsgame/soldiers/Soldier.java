package com.rtsgame.soldiers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Soldier {
	
	private BufferedImage[] frames;
	private int currentFrame;
	
	
	//health
	private int health;
	private int maxhealth;
	private boolean dead;
	//slash
	private boolean slash;
	private int shlashdmg;
	private int slashrange;
	
	private ArrayList<BufferedImage[]> sprites;
	
	
	
	public Soldier(int health){
		this.setHealth(health);
		
	}
	
	public void attack(){
		
		
		
	
		
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	   
}
