package com.example.altem.mages.cards;

import java.util.ArrayList;

import com.example.altem.mages.CardLocation;
import com.example.altem.mages.ManaColor;

public abstract class DeedCard extends Card {
	public DeedCard(String displayLabel){
		super(displayLabel);
	}
	
	protected abstract String initBasicText();
	protected abstract String initStrongerText();
	
	/*
	 * Only one effect type is visibile. If stronger, the primary requirement is invisible.
	 */
	public void setOneCETypeVisible(CEType type){
		for(CardEffect c: this.cardEffects){
			if(c.getCEType()!=type){
				c.setVisible(false);
			}
			
			c.hidePrimaryManaRequirement();
			
		}
	}
	
	public void onEndTurn(){
		reset();
	}
	
	public void reset(){
		timesCanUsePerTurn = 1;
		for(CardEffect c:cardEffects)
			c.reset();
		
		this.gameContext.moveCardToLocation(this.uniqueName, CardLocation.DiscardPile);
	}
	
}
