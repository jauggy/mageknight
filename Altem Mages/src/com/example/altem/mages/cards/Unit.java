package com.example.altem.mages.cards;

import java.util.ArrayList;

public abstract class Unit extends Card{
	public enum UnitStatus{
		Spent, Wounded, Poisoned, CannotAssignDamage, Ready
	}
	
	private UnitStatus status;
	
	public Unit(String displayLabel) {
		super(displayLabel);
		// TODO Auto-generated constructor stub
	}
	
	public void setStatus(UnitStatus st){
		status=st;
	}
	
	
	public void onEndTurn(){
		if(status!=UnitStatus.Wounded && status!=UnitStatus.Poisoned)
			this.status = UnitStatus.Ready;
	}


}
