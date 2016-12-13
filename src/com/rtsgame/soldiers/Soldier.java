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
			2,7,5,6
	};
	 
	private static final int IDLE = 0;
	private static final int WALKING = 1;
	private static final int SLASH = 2;
	private static final int DEAD = 3;
	
	public Soldier(TileMap tm){
		
		super(tm);
		
		width = 30;
		height = 30;
		cwidth = 20;
		cheight = 20;
		
		moveSpeed = 0.3;
		maxSpeed = 1.6;
		stopSpeed = 0.4;
		
		
		health = maxHealth = 100;
		slashdmg = 33;
		slashrange = 30;
		
		try{
			BufferedImage spritesheet = ImageIo.read(
					getClass().getResourceAsStream("a")
					)
				);
			for(int i = 0; i < 7; i++){
				BufferedImage[] bi = 
						new BufferedImage[numFrames[i]];
				for(int j = 0; j <numFrames[i]; j++) {
					bi[j] = spritesheet.getSubimage(
							j  * width,
							i* height,
							height,
							width
							);
				} 
				else 
			}
		}
	}
	
	
	
	public Soldier(int health){
		this.setHealth(health);
		
	}
	
	
	public void attack(){
		
		
		
	
		
		
	}

	
	public void capturing(){
		//press on the building then wait for a while after that the building is captured 
		//and return back 200 coins to the player
		
		
		
		
	}
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	   
}
