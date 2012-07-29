package com.example.altem.mages.cards;

import java.util.ArrayList;

import com.example.altem.mages.Card;
import com.example.altem.mages.CardLocation;

public abstract class NonWoundCard extends Card {
	protected CardEffect cardEffectInPlay;
	protected ArrayList<CardEffect> cardEffects;
	protected int timesCanUsePerTurn = 1;
	
	public NonWoundCard(String displayLabel){
		super(displayLabel);
		cardEffects = initCardEffects();
		for(CardEffect c:cardEffects){
			gameContext.addUniqueNameableToWorld(c);
		}
	}
	
	public void setTimesCanUsePerTurn(int i){
		timesCanUsePerTurn = i;
	}
	
	public abstract ArrayList<CardEffect> initCardEffects();
	
	public CardEffect getEffectInPlay(){
		return cardEffectInPlay;
	}
	public void executeCardEffect(String uniqueName){
		CardEffect e = (CardEffect)this.gameContext.getUniqueNameableByName(uniqueName);
		cardEffectInPlay = e;
		e.Execute();
		
		timesCanUsePerTurn--;
		if(timesCanUsePerTurn==0){
			this.reset();
		}
	}
	public void reset(){
		timesCanUsePerTurn = 1;
		for(CardEffect c:cardEffects)
			c.reset();
		
		this.gameContext.moveCardToLocation(this.uniqueName, CardLocation.DiscardPile);
	}
	
	public void increaseAttack(int i) {
		// TODO Auto-generated method stub
		for(CardEffect ce : this.cardEffects)
		{
			if (AttackCE.class.isAssignableFrom(ce.getClass()) ){
				AttackCE a = (AttackCE)ce;
				a.increaseValue(i);
			}
		}	
	}
	
	public void increaseBlock(int i) {
		// TODO Auto-generated method stub
		for(CardEffect ce : this.cardEffects)
		{
			if (BlockCE.class.isAssignableFrom(ce.getClass()) ){
				BlockCE a = (BlockCE)ce;
				a.increaseValue(i);
			}
		}	
	}

}
