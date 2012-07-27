package com.example.altem.mages;

public class GameContextDependant {
	protected GameContext gameContext;
	public GameContextDependant(){
		this.gameContext = GameContext.getGameContext();
	}
}
