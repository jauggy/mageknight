package com.example.altem.mages.requirement;

import com.example.altem.mages.*;

public class Fulfillable extends GameContextDependent implements IFulfillable {
	private ActionType actionType;
	public Fulfillable(ActionType ac){
		actionType = ac;
	}
	public boolean isFulfillable() {
		// TODO Auto-generated method stub
		return gameContext.canPerformAction(actionType);
	}
	
	
}
