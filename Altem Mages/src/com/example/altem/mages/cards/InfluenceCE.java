package com.example.altem.mages.cards;

import com.example.altem.mages.ManaColor;

public class InfluenceCE extends CardEffect{
	private int value;
	public InfluenceCE(int value, CEType cardEffectType, ManaColor cost){
		super(cardEffectType.toString());
		this.requirementTable.addPrimaryManaRequirement(cost);
	}

	public InfluenceCE(int i, CEType cardEffectType, ManaColor c1, ManaColor c2) {
		// TODO Auto-generated constructor stub
		super(cardEffectType.toString());
		this.requirementTable.addPrimaryManaRequirement(c1);
		this.requirementTable.addSecondaryManaRequirement(c2);
	}


	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		this.gameContext.generateInfluence(value);
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return null;
	}
}
