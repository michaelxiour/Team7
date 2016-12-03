package com.rtsgame.Input;

import com.badlogic.gdx.Gdx;

public class InputAdapter {

	InputProcessors inputProcessor = new InputProcessors();
	
	public InputAdapter(){
		
		Gdx.input.setInputProcessor(inputProcessor);
	}
	
	
	  public boolean keyDown (int keycode) {
	      return false;
	   }

	   public boolean keyUp (int keycode) {
	      return false;
	   }

	   public boolean keyTyped (char character) {
	      return false;
	   }

	   public boolean touchDown (int x, int y, int pointer, int button) {
	     
		   return true;
	   }

	   public boolean touchUp (int x, int y, int pointer, int button) {
	      return true;
	   }

	   public boolean touchDragged (int x, int y, int pointer) {
	      return false;
	   }

	   public boolean mouseMoved (int x, int y) {
	      return false;
	   }

	   public boolean scrolled (int amount) {
	      return false;
	   }
	
	
}
