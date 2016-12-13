package com.rtsgame.screens;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.rtsgame.RtsGame;

public class Hud {
	public Stage stage;
	public Table table;
	//we're adding a viewport because when the game starts, we want the Hud to stay in the same position
	private Viewport viewport;
	
	private static Integer score;
	
	//need to create widgets
	private static Label scoreLabel;
	private Label levelLabel;
	private Label levelTextLabel;
	private Label scoreTextLabel;
	
	//create the constructor 
	public Hud(SpriteBatch sb){
		score = 0;
		
		viewport = new FitViewport(RtsGame.WIDTH, RtsGame.HEIGHT, new OrthographicCamera());
		//it can use the same sprite batch, it wont create a new one
		stage = new Stage(viewport, sb);
		/*
		 * think of the stage as a empty box, if we tried putting widgets in their,
		 * they would just fall and wont have any organisation.
		 * in order to create organisation, were going to create a table inside our stage.
		 * we can then layout the table in a way to organize our labels in a certain position inside of our stage.
		 */
		
		//create a table
		Table table = new Table();
		//position the table at the top
		table.top();
		//make the table the same size as the stage
		table.setFillParent(true);
		
		//the first thing a label takes is the string that will be attached to our label
		//the first thing in a label style is the bitmap style that we're going to use, we're going to use the 
		//default bitmap font (graphic version of the font)
		//score will be 6 digits long instead of 3
		scoreLabel = new Label(String.format("%06d", score), new LabelStyle(new BitmapFont(), Color.WHITE));
		//put 1-1 for now as its the only level we're going to be creating 
		levelLabel = new Label(String.format("1-1", new LabelStyle(new BitmapFont(), Color.WHITE)));
		worldLabel = new Label(String.format("WORLD", new LabelStyle(new BitmapFont(), Color.WHITE)));
		marioLabel = new Label(String.format("LEVEL", new LabelStyle(new BitmapFont(), Color.WHITE)));
		
		//top row
		table.add(scoreTextLabel).expandX().padTop(10);
		table.add(levelTextLabel).expandX().padTop(10);
		//creating a new row
		table.row();
		//not going to pad score anymore
		table.add(scoreLabel).expandX();
		table.add(levelLabel).expandX();

		
		//we need to add the table to the stage
		stage.addActor(table);
		
		/*
		 * go back to the play screen class and add the following code
		 * 
		 * in the fields you need to write:
		 * 
		 * private Hud hud;
		 * 
		 * in the constructor of play screen you need to write:
		 * 
		 * hud = new Hud(game.batch);
		 * 
		 * in the override render method you need to write:
		 * 
		 * game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
		 * hud.stage.draw();
		 * 
		 * 
		 */
		
		/*
		 * keeping score and time
		 */
	}
	
	/*
	 * in the game screen you need to write in the public void update (float dt) method:
	 * hud.update(dt);
	 * this now should allow the timing to work
	 */
	
	public static void addScore (int value){
		score += value;
		scoreLabel.setText(String.format("%06d", score));	
	}
	
	/*
	 * inside brick class you need to write:
	 * 
	 * Hud.addScore(200);
	 * 
	 * which should then update the score if you touch a brick by 200.
	 * basically write a code in another class for how the points will be collected
	 * 
	 */
	
	
	
	public void dispose() { 
		
		stage.dispose();
		}
	
	
}


