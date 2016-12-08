package com.rtsgame.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.rtsgame.RtsGame;

public class GameScreen implements Screen {

	
	
	Texture img;
	Sprite sprite;
	float x;
	float y;
	

	
	RtsGame game;
	
	public GameScreen (RtsGame game){
		this.game = game;
	}
	
	public void show() {
		img = new Texture("controls.png");
	}

	public void create(){
		this.create();
		img = new Texture("controls.png");
		sprite = new Sprite(img);
		sprite.setPosition(Gdx.graphics.getWidth()/2 - sprite.getWidth()/2,
				Gdx.graphics.getHeight()/2- sprite.getHeight()/2);
			
		
	}
	
	public void render(float delta) {
		
		if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
			sprite.setPosition(sprite.getX(), sprite.getY());
		
		}
		
		
	
		Gdx.gl.glClearColor(0, 0, 0, 1);
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
