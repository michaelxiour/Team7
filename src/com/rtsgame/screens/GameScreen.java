package com.rtsgame.screens;


import com.badlogic.gdx.Gdx;	
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.rtsgame.RtsGame;

public class GameScreen implements Screen {

	
	
	float x;
	float y;

	private TiledMap map;
	private  IsometricTiledMapRenderer renderer;
	private OrthographicCamera camera;
 	
	private OrthographicCamera hudcam;
	private Viewport gameport;

	
	RtsGame game;
	
	public GameScreen (RtsGame game){
		
		this.game = game;	
		gameport = new FitViewport(RtsGame.WIDTH, RtsGame.HEIGHT, camera);
	}
	
	public void show() {
		TmxMapLoader loader = new TmxMapLoader();
		map = loader.load("map/desertMap_Test1.tmx"); 
		
		renderer = new IsometricTiledMapRenderer(map);
		
		camera = new OrthographicCamera();
	}

	public void create(){
			
		
	}
	
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		
		
		
		

		renderer.setView(camera);
		renderer.render();
		
		
		game.batch.end();
		
	}
	
	
	
	
	public void resize(int width, int height) {
		camera.viewportWidth = width;
		camera.viewportHeight = height;
		camera.update();

		
	}

	
	public void pause() {
		
		
	}

	
	public void resume() {
	
		
	}

	
	public void hide() {
	}

	
	public void dispose() {
		map.dispose();
		renderer.dispose();

	
	}


	


	
}
