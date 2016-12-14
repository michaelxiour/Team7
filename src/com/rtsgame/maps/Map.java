package com.rtsgame.maps;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.rtsgame.RtsGame;
import com.rtsgame.screens.GameScreen;
import com.rtsgame.screens.PLay;

public class Map  extends Game {
	RtsGame game;
	
	protected TiledMap tileMap;
	protected int tileSize;
	protected double xmap;
	protected double ymap;
	
	protected double x;
	protected double y;
	protected double dx;
	protected double dy;
	
	protected int width;
	protected int height;
	
	protected int cheight;
	protected int cwidth;
	
	
	
	public Map(TiledMap tm){
		
		tileMap = tm;
		
	}



	@Override
	public void create() {
		setScreen(new GameScreen(game));
		
	}
	
	
}
