package com.rtsgame.screens;

import java.awt.event.MouseEvent;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.rtsgame.RtsGame;

public class GameScreen implements Screen {

	Texture img;
	float x;
	float y;
	public static float SPEED = 200;
	
	RtsGame game;
	
	public GameScreen (RtsGame game){
		this.game = game;
	}
	
	public void show() {
		img = new Texture("dungeonMap.png");
		
	}

	
	public void render(float delta) {
		
		if(Gdx.input.isTouched(MouseEvent.MOUSE_PRESSED)){
			y +=  SPEED * Gdx.graphics.getDeltaTime();
		}

		
		if(Gdx.input.isKeyPressed(Keys.S)){
			y -= SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.A)){
			x -= SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.D)){
			x += SPEED * Gdx.graphics.getDeltaTime();
		}
		
		
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		
		
		game.batch.draw(img, x, y);
		
		
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
