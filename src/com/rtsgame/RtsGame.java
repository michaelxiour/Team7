package com.rtsgame;



import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.rtsgame.screens.MenuScreen;


public class RtsGame extends Game {
	public SpriteBatch batch;
	
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 1000;
	
	
	
	public void create () {
		
		batch = new SpriteBatch();
		this.setScreen(new MenuScreen(this));
		
	}

	@Override
	public void render () {
		super.render();
		
		
	}


	

	
}
