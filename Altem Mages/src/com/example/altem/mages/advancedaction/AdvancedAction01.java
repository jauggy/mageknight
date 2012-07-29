package com.example.altem.mages.advancedaction;

import java.util.ArrayList;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.ManaConsumable;
import com.example.altem.mages.ManaForm;
import com.example.altem.mages.actioncomponent.Attack;
import com.example.altem.mages.cards.AttackCE;
import com.example.altem.mages.cards.CEType;
import com.example.altem.mages.cards.CardEffect;
import com.example.altem.mages.cards.DeedCard;
import com.example.altem.mages.cards.GainManaConsumableCE;
import com.example.altem.mages.enemies.AttackType;
import com.example.altem.mages.enemies.ElementType;

public class AdvancedAction01 extends DeedCard {

	public AdvancedAction01() {
		super("FIRE BOLT");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String initBasicText() {
		// TODO Auto-generated method stub
		return "Gain a red crystal to your Inventory";
	}

	@Override
	protected String initStrongerText() {
		// TODO Auto-generated method stub
		return "Ranged Fire Attack 3";
	}

	@Override
	public ArrayList<CardEffect> initCardEffects() {
		// TODO Auto-generated method stub
		ArrayList<CardEffect> ce = new ArrayList<CardEffect>();
		ce.add(new GainManaConsumableCE(new ManaConsumable(ManaColor.Red,ManaForm.Crystal), CEType.Basic, null, null));
		ce.add(new AttackCE(new Attack(3, AttackType.Ranged,ElementType.Fire), CEType.Stronger, ManaColor.Red, null));
		return ce;
	}


}
