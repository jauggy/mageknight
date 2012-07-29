package com.example.altem.mages.advancedaction;

import java.util.ArrayList;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.cards.CardEffect;
import com.example.altem.mages.cards.DeedCard;
import com.example.altem.mages.cards.HealCE;
import com.example.altem.mages.cards.MoveCE;

public class AdvancedAction08 extends DeedCard{

	public AdvancedAction08(String displayLabel) {
		super("REFRESHING WALK");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String initBasicText() {
		// TODO Auto-generated method stub
		return "Move 2 and Heal 1";
	}

	@Override
	protected String initStrongerText() {
		// TODO Auto-generated method stub
		return "Move 4 and Heal 2";
	}

	@Override
	public ArrayList<CardEffect> initCardEffects() {
		// TODO Auto-generated method stub
		ArrayList<CardEffect> ce = new ArrayList<CardEffect>();
		MoveCE m1 = new MoveCE(2);
		m1.addSubEffect(new HealCE(1));
		
		MoveCE m2 = new MoveCE(4,ManaColor.Green);
		m2.addSubEffect(new HealCE(2));
		
		ce.add(m1);
		ce.add(m2);
		return ce;
	}

}
