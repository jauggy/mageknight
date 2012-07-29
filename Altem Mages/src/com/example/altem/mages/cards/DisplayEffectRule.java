package com.example.altem.mages.cards;

import java.util.ArrayList;

import com.example.altem.mages.ActionType;
import com.example.altem.mages.GameContextDependent;
import com.example.altem.mages.requirement.ActionTypeChoiceRequirement;

/*
 * If an effect has multi actions then we display. If nothing comes up in the requirement drop down then the 
 * form can never be valid.
 */
public class DisplayEffectRule extends GameContextDependent {
	ActionType actionType;
	public DisplayEffectRule(ActionType type){
		actionType = type;
	}
	
	public boolean shouldDisplay(){
		return gameContext.canPerformAction(actionType);
	}
}
