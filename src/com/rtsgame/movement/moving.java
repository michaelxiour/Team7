package com.rtsgame.movement;

import com.badlogic.gdx.Gdx;

public class moving {

	
	 boolean move;
	    private int x;
	    
	    
	    public void updateMotion()
	    {
	        if (move)
	        {
	            x -= 5 * Gdx.graphics.getDeltaTime();
	        }
	             }
	    
	    
	    public void setMove(boolean t)
	    {
	        if(move && t) move = false;
	        move = t;
	    }
	    
}
