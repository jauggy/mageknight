package com.example.altem.mages.cards;

import com.example.altem.mages.ActionType;
import com.example.altem.mages.GameContextDependent;

public class SimpleCardEffect extends GameContextDependent implements ICardEffect{
	private ActionType actionType;
	private String displayLabel;
	
	public SimpleCardEffect(String displayLabel,ActionType actionType){
		this.displayLabel=displayLabel;
	}
	
	public String getDisplayLabel(){
		return displayLabel;
	}
	
	public boolean isAvailable(){
		return gameContext.canPerformAction(actionType);
	}
}
