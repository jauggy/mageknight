package com.example.altem.mages.requirement;

import java.util.ArrayList;

import com.example.altem.mages.CardLocation;
import com.example.altem.mages.ColorMatchRestriction;
import com.example.altem.mages.IUniqueNameable;
import com.example.altem.mages.cards.Card;

public class DiscardRequirement extends Requirement {
	private ColorMatchRestriction restriction;
	public DiscardRequirement(){
		this(ColorMatchRestriction.None);
	}
	public DiscardRequirement(ColorMatchRestriction colorMatchRestriction){
		this.restriction = colorMatchRestriction;
	}
	@Override
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return "Discard";
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
		this.gameContext.moveCardToLocation(getSelected(),CardLocation.DiscardPile);
		
	}

}
