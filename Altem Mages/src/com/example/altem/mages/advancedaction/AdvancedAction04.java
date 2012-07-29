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

public class AdvancedAction04 extends DeedCard{

	public AdvancedAction04() {
		super("CRUSHING BOLT");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String initBasicText() {
		// TODO Auto-generated method stub
		return "Gain a green crystal to your Inventory";
	}

	@Override
	protected String initStrongerText() {
		// TODO Auto-generated method stub
		return "Siege Attack 3";
	}

	@Override
	public ArrayList<CardEffect> initCardEffects() {
		// TODO Auto-generated method stub
		ArrayList<CardEffect>ce = new ArrayList<CardEffect>();
		ce.add(new GainManaConsumableCE(new ManaConsumable(ManaColor.Green,ManaForm.Crystal),CEType.Basic,null,null));
		ce.add(new AttackCE(new Attack(3,AttackType.Siege),CEType.Stronger,ManaColor.Green,null));
		return ce;
	}


	
}
