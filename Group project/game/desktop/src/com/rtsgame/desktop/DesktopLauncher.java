package com.rtsgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.rtsgame.RtsGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60;
		config.width = RtsGame.WIDTH;
		config.height = RtsGame.HEIGHT;
		new LwjglApplication(new RtsGame(), config);
	}
}
