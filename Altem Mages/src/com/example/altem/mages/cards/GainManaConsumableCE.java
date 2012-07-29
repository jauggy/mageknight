package com.example.altem.mages.cards;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.ManaConsumable;

public class GainManaConsumableCE extends CardEffect{
	ManaConsumable mana;
	public GainManaConsumableCE(ManaConsumable mana, CEType type, ManaColor c1, ManaColor c2) {
		super(type, c1, c2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExecutePrimary() {
		// TODO Auto-generated method stub
		gameContext.addUniqueNameableToWorld(mana);
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Any;
	}

}
