package com.rtsgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.rtsgame.RtsGame;

public class HtpScreen {


	RtsGame game;
	public HtpScreen(RtsGame game){
		
		this.game = game;
		}

	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		
		
		
		
		
		game.batch.end();
		
	}
	
public void resize(int width, int height) {
		
		
	}

	
	public void pause() {
		
		
	}

	
	public void resume() {
	
		
	}

	
	public void hide() {

	}

	
	public void dispose() {
		
	}
	
}
