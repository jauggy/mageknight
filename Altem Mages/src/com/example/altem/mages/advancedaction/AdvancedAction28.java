package com.example.altem.mages.advancedaction;

import java.util.ArrayList;

import com.example.altem.mages.CardLocation;
import com.example.altem.mages.ColorMatchRestriction;
import com.example.altem.mages.ManaColor;
import com.example.altem.mages.cards.CardEffect;
import com.example.altem.mages.cards.DeedCard;
import com.example.altem.mages.cards.GainCardCE;
import com.example.altem.mages.cards.GainCardCE.GainCardRestriction;

public class AdvancedAction28 extends DeedCard{

	public AdvancedAction28() {
		super("TRAINING");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String initBasicText() {
		// TODO Auto-generated method stub
		return "Throw away an Action card from your hand, then take a card of the same color from the Advanced Actions offer and put it into your discard pile.";
	}

	@Override
	protected String initStrongerText() {
		// TODO Auto-generated method stub
		return "Throw away an Action card from your hand, then take a card of the same color from the Advanced Actions offer and put it into your hand.";
	}

	@Override
	public ArrayList<CardEffect> initCardEffects() {
		// TODO Auto-generated method stub
		GainCardCE c1 = new GainCardCE(CardLocation.AdvancedActionOffer,CardLocation.DiscardPile,GainCardRestriction.ColorLastThrown,null);
		c1.addThrowRequirement(ColorMatchRestriction.AdvancedActionOffer);
		GainCardCE c2 = new GainCardCE(CardLocation.AdvancedActionOffer,CardLocation.Hand,GainCardRestriction.ColorLastThrown,ManaColor.Green);
		c2.addThrowRequirement(ColorMatchRestriction.AdvancedActionOffer);
		
		ArrayList<CardEffect> ce = new ArrayList<CardEffect>();
		ce.add(c1);
		ce.add(c2);
		return ce;
	}

}
