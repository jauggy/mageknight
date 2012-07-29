package com.example.altem.mages.advancedaction;

import java.util.ArrayList;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.cards.CEType;
import com.example.altem.mages.cards.CardEffect;
import com.example.altem.mages.cards.DeedCard;
import com.example.altem.mages.cards.HeroicReputationCE;
import com.example.altem.mages.cards.InfluenceCE;
import com.example.altem.mages.cards.ReputationCE;

public class AdvancedAction15 extends DeedCard {

	@Override
	protected String initBasicText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String initStrongerText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CardEffect> initCardEffects() {
		// TODO Auto-generated method stub
		ArrayList<CardEffect> cardEffects = new ArrayList<CardEffect>();
		
		CardEffect i = new InfluenceCE(3,CEType.Basic,null);
		i.addSubEffect(new HeroicReputationCE(1,0));
		
		CardEffect i2 = new InfluenceCE(6,CEType.Basic,ManaColor.White);
		i2.addSubEffect(new HeroicReputationCE(1,1));
		
		cardEffects.add(i);
		cardEffects.add(i2);
		return cardEffects;
		
	}

	@Override
	public CardEffect getEffectInPlay() {
		// TODO Auto-generated method stub
		return null;
	}

}
