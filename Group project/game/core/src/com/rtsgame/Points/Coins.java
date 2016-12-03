package com.rtsgame;

public class TestTimer {
	
	int coins = 0;
				
	public void iterateCoins(){
		while(coins != 100){
			try{
				Thread.sleep(1000);
				coins++;
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	public int getCoins(){
		return coins;
	}
		
}
