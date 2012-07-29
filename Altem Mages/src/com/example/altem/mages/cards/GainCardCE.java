package com.example.altem.mages.cards;

import com.example.altem.mages.CardLocation;
import com.example.altem.mages.ColorMatchRestriction;
import com.example.altem.mages.ManaColor;

public class GainCardCE extends CardEffect{
	public enum GainCardRestriction{
		None,ColorLastThrown,CardGainMana
	}
	
	private CardLocation  from;
	private CardLocation to;
	private GainCardRestriction restriction;
	
	public GainCardCE(CardLocation from, CardLocation to, GainCardRestriction restriction, ManaColor cost){
		super(CEType.Stronger,cost,null);
		this.from =from;
		this.to = to;
	}

	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		gameContext.showGainCardView(from,to,restriction);
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Any;
	}
	
	public void addThrowRequirement(){
		if(from.equals(CardLocation.AdvancedActionOffer))
			this.addThrowRequirement(ColorMatchRestriction.AdvancedActionOffer);
		else if(from.equals(CardLocation.SpellOffer))
			this.addThrowRequirement(ColorMatchRestriction.SpellOffer);
		
	}
	
}
