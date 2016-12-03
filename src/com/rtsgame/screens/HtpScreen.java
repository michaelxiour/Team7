package com.rtsgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.rtsgame.RtsGame;

public class HtpScreen implements Screen {

	private Texture bgimg;
	private static final int BACK_BUTTON_WIDTH = 150;
	private static final int BACK_BUTTON_HEIGHT = 50;
	private static final int BACK_BUTTON_Y = 200;
	
	Texture backbutton;
	RtsGame game;
	public HtpScreen(RtsGame game){
		
		this.game = game;
		backbutton = new Texture("go back.png");
		}
	public void show(){
		bgimg = new Texture(Gdx.files.internal("how to play screen.png"));
		
	}

	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		game.batch.draw(bgimg, 0, 0);
		int x = RtsGame.WIDTH /2 - BACK_BUTTON_WIDTH /2;
		
		if (Gdx.input.getX() < x + BACK_BUTTON_WIDTH && Gdx.input.getX() > x && RtsGame.HEIGHT - Gdx.input.getY() < BACK_BUTTON_Y + BACK_BUTTON_HEIGHT && RtsGame.HEIGHT - Gdx.input.getY() > BACK_BUTTON_Y){
			game.batch.draw(backbutton,RtsGame.WIDTH /2 - BACK_BUTTON_WIDTH /2 ,BACK_BUTTON_Y, BACK_BUTTON_WIDTH, BACK_BUTTON_HEIGHT);
			if(Gdx.input.isTouched()){
				game.setScreen(new MenuScreen(game));
			}
		}
		
		
		
		
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
