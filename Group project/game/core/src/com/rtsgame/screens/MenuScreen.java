package com.rtsgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.rtsgame.RtsGame;

public class MenuScreen implements Screen {


	private static final int EXIT_BUTTON_WIDTH = 150;
	private static final int EXIT_BUTTON_HEIGHT = 50;
	private static final int EXIT_BUTTON_Y = 450;
	private static final int START_BUTTON_Y = 650;
	private static final int HOWTOPLAY_BUTTON_Y = 550;
	private static final int START_BUTTON_WIDTH = 150;
	private static final int START_BUTTON_HEIGHT = 50;
	private static final int HOWTOPLAY_BUTTON_WIDTH =150;
	private static final int HOWTOPLAY_BUTTON_HEIGHT = 50;
		

	
	
	
	RtsGame game;
	
	Texture exitButton;
	Texture startButton;
	Texture howtoplayButton;
	Texture exitButton2;
	Texture startButton2;
	Texture howtoplayButton2;
	
	
	public MenuScreen(RtsGame game){
		
				this.game = game;
		exitButton = new Texture("exitbutton.png");
		exitButton2 = new Texture("exitbutton2.png");
		startButton2 = new Texture("startbutton2.png");
		startButton = new Texture("startbutton.png");
		howtoplayButton2 = new Texture("howtoplaybutton2.png");
		howtoplayButton = new Texture("howtoplaybutton.png");
	}
	
	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		int x = RtsGame.WIDTH /2 - EXIT_BUTTON_WIDTH /2;
		
		if (Gdx.input.getX() < x + EXIT_BUTTON_WIDTH && Gdx.input.getX() > x && RtsGame.HEIGHT - Gdx.input.getY() < EXIT_BUTTON_Y + EXIT_BUTTON_HEIGHT && RtsGame.HEIGHT - Gdx.input.getY() > EXIT_BUTTON_Y){
			game.batch.draw(exitButton2,RtsGame.WIDTH /2 - EXIT_BUTTON_WIDTH /2 ,EXIT_BUTTON_Y, EXIT_BUTTON_WIDTH, EXIT_BUTTON_HEIGHT);
			if(Gdx.input.isTouched()){
				Gdx.app.exit();
			}
		} else {
			game.batch.draw(exitButton,RtsGame.WIDTH /2 - EXIT_BUTTON_WIDTH /2 ,EXIT_BUTTON_Y, EXIT_BUTTON_WIDTH, EXIT_BUTTON_HEIGHT);
				
			
		}
		
		
		if (Gdx.input.getX() < x + START_BUTTON_WIDTH && Gdx.input.getX() > x && RtsGame.HEIGHT - Gdx.input.getY() < START_BUTTON_Y + START_BUTTON_HEIGHT && RtsGame.HEIGHT - Gdx.input.getY() > START_BUTTON_Y){
			game.batch.draw(startButton2,RtsGame.WIDTH /2 - START_BUTTON_WIDTH /2 , START_BUTTON_Y , START_BUTTON_WIDTH, START_BUTTON_HEIGHT);
			if(Gdx.input.isTouched()){
				this.dispose();
				game.setScreen(new GameScreen(game));
			}
				
			
		} else {
			game.batch.draw(startButton,RtsGame.WIDTH /2 - START_BUTTON_WIDTH /2 ,START_BUTTON_Y, START_BUTTON_WIDTH, START_BUTTON_HEIGHT);
		}
		
		if (Gdx.input.getX() < x + HOWTOPLAY_BUTTON_WIDTH && Gdx.input.getX() > x && RtsGame.HEIGHT - Gdx.input.getY() < HOWTOPLAY_BUTTON_Y + HOWTOPLAY_BUTTON_HEIGHT && RtsGame.HEIGHT - Gdx.input.getY() > HOWTOPLAY_BUTTON_Y){
			game.batch.draw(howtoplayButton2,RtsGame.WIDTH / 2 - HOWTOPLAY_BUTTON_WIDTH /2 ,HOWTOPLAY_BUTTON_Y, HOWTOPLAY_BUTTON_WIDTH, HOWTOPLAY_BUTTON_HEIGHT);
			if(Gdx.input.isTouched()){
			
			}
			
		} else {
			game.batch.draw(howtoplayButton,RtsGame.WIDTH / 2 - HOWTOPLAY_BUTTON_WIDTH /2 ,HOWTOPLAY_BUTTON_Y, HOWTOPLAY_BUTTON_WIDTH, HOWTOPLAY_BUTTON_HEIGHT);
		}
		
		
		
		game.batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
	
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	

	
}
