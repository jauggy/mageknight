package com.example.altem.mages.choices;

import com.example.altem.mages.ActionType;
import com.example.altem.mages.GameContextDependent;

public  abstract class Choice extends GameContextDependent {
	private ActionType actionType;
	public Choice (ActionType type){
		actionType = type;
	}
	public  boolean isAvailable(){
		return gameContext.canPerformAction(actionType);
	}
	
	public  abstract String getDisplayLabel();
	
	public static MoveChoice Move = new MoveChoice();
}

