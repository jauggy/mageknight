package com.example.altem.mages.cards;

import com.example.altem.mages.ICardListener;
import com.example.altem.mages.ManaColor;

public class AmbushCE  extends CardEffect implements ICardListener{

	private double attackModifier;
	private double blockModifier;
	
	/*
	 * @param attackModifier attack mod
	 * @param blockModifier block mod
	 */
	public AmbushCE(double attackModifier, double blockModifier) {
		// TODO Auto-generated constructor stub
		this.attackModifier = attackModifier;
		this.blockModifier = blockModifier;
		
	}

	public void onCardPreExecute(Card selectedCard) {
		// TODO Auto-generated method stub
		CardEffect  ce =selectedCard.getEffectInPlay();
		if(ce instanceof AttackCE){
			AttackCE ace = (AttackCE)ce;
			ace.increaseValue(attackModifier);
		}
		else if(ce instanceof BlockCE){
			BlockCE bce = (BlockCE)ce;
			bce.increaseValue(blockModifier);
		}
	}

	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		gameContext.registerCardListener(this);
	}

	public void onCardPostExecute(Card selectedCard) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Any;
	}

}
