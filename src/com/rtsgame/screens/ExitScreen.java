package com.rtsgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.rtsgame.RtsGame;

public class ExitScreen implements Screen {

	

	private Texture bgimg;
	private static final int YES_BUTTON_WIDTH = 150;
	private static final int YES_BUTTON_HEIGHT = 50;
	private static final int YES_BUTTON_Y = 300;

	private static final int NO_BUTTON_WIDTH = 150;
	private static final int NO_BUTTON_HEIGHT = 50;
	private static final int NO_BUTTON_Y = 220 ;
	
	
	Texture yesbutton;
	Texture nobutton;
	RtsGame game;
	public ExitScreen(RtsGame game){
		
		this.game = game;
		yesbutton = new Texture("yes.png");
		nobutton = new Texture("no.png");
	}
	public void show(){
		bgimg = new Texture(Gdx.files.internal("Main menu - exit game.png"));
		
	}


	
	

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		game.batch.draw(bgimg, 0, 0);
		int x = RtsGame.WIDTH /2 - YES_BUTTON_WIDTH /2;
		
		if (Gdx.input.getX() < x + YES_BUTTON_WIDTH && Gdx.input.getX() > x && RtsGame.HEIGHT - Gdx.input.getY() < YES_BUTTON_Y + YES_BUTTON_HEIGHT && RtsGame.HEIGHT - Gdx.input.getY() > YES_BUTTON_Y){
			game.batch.draw(yesbutton,RtsGame.WIDTH /2 - YES_BUTTON_WIDTH /2 ,YES_BUTTON_Y,  YES_BUTTON_WIDTH, YES_BUTTON_HEIGHT);
			if(Gdx.input.isTouched()){
				Gdx.app.exit();
				
			}
		}
		if (Gdx.input.getX() < x + NO_BUTTON_WIDTH && Gdx.input.getX() > x && RtsGame.HEIGHT - Gdx.input.getY() < NO_BUTTON_Y + NO_BUTTON_HEIGHT && RtsGame.HEIGHT - Gdx.input.getY() > NO_BUTTON_Y){
			game.batch.draw(nobutton,RtsGame.WIDTH /2 - NO_BUTTON_WIDTH /2 ,NO_BUTTON_Y, NO_BUTTON_WIDTH, NO_BUTTON_HEIGHT);
			if(Gdx.input.isTouched()){
				game.setScreen(new MenuScreen(game));
				
			}
		}
		
		
		
		
		game.batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
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
