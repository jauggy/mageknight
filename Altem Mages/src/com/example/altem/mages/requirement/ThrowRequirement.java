package com.example.altem.mages.requirement;

import java.util.ArrayList;

import com.example.altem.mages.CardLocation;
import com.example.altem.mages.ColorMatchRestriction;
import com.example.altem.mages.IUniqueNameable;
import com.example.altem.mages.cards.Card;

public class ThrowRequirement extends Requirement {
	private ColorMatchRestriction restriction;
	public ThrowRequirement(){
		this(ColorMatchRestriction.None);
	}
	public ThrowRequirement(ColorMatchRestriction colorMatchRestriction){
		this.restriction = colorMatchRestriction;
	}
	@Override
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return "Throw";
	}

	@Override
	public IUniqueNameable[] getSelectables() {
		// TODO Auto-generated method stub
		ArrayList<Card> cards = this.gameContext.getCardsInHand(restriction);
		return cards.toArray(new IUniqueNameable[cards.size()]);
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		this.gameContext.moveCardToLocation(getSelected(),CardLocation.Box);
		
	}

}
