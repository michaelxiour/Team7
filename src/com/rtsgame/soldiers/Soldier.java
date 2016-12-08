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
	private final int[] numFrames = {
			1, 5, 2
	};
	
	private static final int IDLE = 0;
	private static final int WALKING = 1;
	private static final int SLASH = 2;
	
	
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
