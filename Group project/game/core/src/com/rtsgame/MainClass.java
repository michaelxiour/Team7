package com.rtsgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;




public class MainClass extends ApplicationAdapter {
	
	private SpriteBatch 			spriteBatch = null;
	private OrthographicCamera 		cam2d = null;
	private int						WIDTH,HEIGHT;
	
	private TextureAtlas			movement;
	private Array<Sprite>			soldier;
	private int						currentFrame = 0;
	private final float				frameLength = 0f;	
	private float					animationElapsed = 0f;
	
	
	
	
	@Override
public void create() {
		
		spriteBatch = new SpriteBatch();
		movement = new TextureAtlas("assets/image/spritesheet.txt");
		soldier = movement.createSprites("walkingse");
		
		for(int i=0; i<soldier.size; i++){
			soldier.get(i).setSize(2.0f, 2.0f);
			soldier.get(i).setPosition(-1.5f, -1.5f); 
		}
		
		
	}

@Override
public void resize(int width, int height) {
	WIDTH = width;
	HEIGHT = height;
	
	float camWidth = 10.0f;
	float camHeight = camWidth * (float)HEIGHT / (float)WIDTH;
	cam2d = new OrthographicCamera(camWidth, camHeight);            
	cam2d.update();
	
}
@Override
public void render() {
	
	
	float dt = Gdx.graphics.getDeltaTime();
	animationElapsed += dt;
	while(animationElapsed > frameLength){
		animationElapsed -= frameLength;
		currentFrame = (currentFrame == soldier.size - 1) ? 0 : ++currentFrame;
	}
	
	
	GL20 gl = Gdx.graphics.getGL20();
	gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	
	spriteBatch.setProjectionMatrix(cam2d.combined);
	spriteBatch.begin();
	soldier.get(currentFrame).draw(spriteBatch);
	spriteBatch.end();
	
}
@Override
public void pause() {
	
}
@Override
public void resume() {
	
}
@Override
public void dispose() {
	
}

}
