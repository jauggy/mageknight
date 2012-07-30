package com.example.altem.mages.cards;

import java.util.ArrayList;

import com.example.altem.mages.CardLocation;
import com.example.altem.mages.IEndTurnListener;
import com.example.altem.mages.IValueHolder;
import com.example.altem.mages.UniqueHelper;
import com.example.altem.mages.UniqueNameable;
import com.example.altem.mages.actioncomponent.Attack;
import com.example.altem.mages.actioncomponent.Block;
import com.example.altem.mages.viewmodel.DTO;
import com.example.altem.mages.viewmodel.CardDTO;
import com.example.altem.mages.viewmodel.CardEffectDTO;

public abstract class Card extends UniqueNameable implements IEndTurnListener {
	protected CardEffect cardEffectInPlay; //updated when update and executed is called
	protected ArrayList<CardEffect> cardEffects;
	protected int timesCanUsePerTurn = 1;
	
	public Card(String displayLabel){
		this.displayLabel = displayLabel;
		cardEffects = initCardEffects();
		for(CardEffect c:cardEffects){
			gameContext.addUniqueNameableToWorld(c);
		}
		this.cardEffects = initCardEffects();
		this.gameContext.registerEndTurnListener(this);
	}
	
	protected String displayLabel;
	public String getDisplayLabel(){
		return displayLabel;
	}
	
	public ArrayList<CardEffect> getCardEffects(){
		return this.cardEffects;
	}
	
	public void setTimesCanUsePerTurn(int i){
		timesCanUsePerTurn = i;
	}
	
	protected abstract ArrayList<CardEffect> initCardEffects();
	
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
		increaseValue(i,Attack.class);
	}
	
	public <T extends IValueHolder>  void increaseValue(int i, Class<T> type)  {
		for(CardEffect ce:this.cardEffects){
			if(type.isAssignableFrom(ce.getClass())){
				IValueHolder v = (IValueHolder) ce;
				v.increaseValue(i);
			}
		}
	}

	
	public void increaseBlock(int i) {
		increaseValue(i,Block.class);
	}
	
	public DTO toDTO(){
		CardDTO c = new CardDTO(this);
		c.CardEffects = UniqueHelper.toDTOArray(this.cardEffects);
		

		return c;
	}

}
