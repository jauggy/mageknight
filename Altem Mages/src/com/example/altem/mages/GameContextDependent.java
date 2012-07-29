package com.example.altem.mages;

public class GameContextDependent {
	protected GameContext gameContext;
	public GameContextDependent(){
		this.gameContext = GameContext.getGameContext();
	}
}
