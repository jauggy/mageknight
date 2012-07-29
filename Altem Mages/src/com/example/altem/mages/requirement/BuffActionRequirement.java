package com.example.altem.mages.requirement;

import java.util.ArrayList;

import com.example.altem.mages.Card;
import com.example.altem.mages.IUniqueNameable;

public class BuffActionRequirement extends Requirement{

	
	@Override
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return "Buff card";
	}

	@Override
	public IUniqueNameable[] getSelectables() {
		// TODO Auto-generated method stub
		ArrayList<Card> stuff = this.gameContext.getActionCardsInHand();
		return stuff.toArray(new IUniqueNameable[stuff.size()]);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

}
