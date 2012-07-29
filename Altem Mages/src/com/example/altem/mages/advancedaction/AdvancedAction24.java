package com.example.altem.mages.advancedaction;

import java.util.ArrayList;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.cards.AmbushCE;
import com.example.altem.mages.cards.CEType;
import com.example.altem.mages.cards.CardEffect;
import com.example.altem.mages.cards.DeedCard;
import com.example.altem.mages.cards.MoveCE;

public class AdvancedAction24 extends DeedCard {

	public AdvancedAction24() {
		super("AMBUSH");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String initBasicText() {
		// TODO Auto-generated method stub
		return "Move 2. Add +1 to your first Attack card of any type or +2 to your first Block card of any type, whichever you play first.";
	}

	@Override
	protected String initStrongerText() {
		// TODO Auto-generated method stub
		return "Move 4. Add +2 to your first Attack card of any type or +4 to your first Block card of any type, whichever you play first this turn.";
	}

	@Override
	public ArrayList<CardEffect> initCardEffects() {
		// TODO Auto-generated method stub
		ArrayList<CardEffect> ce = new ArrayList<CardEffect>();
		MoveCE c1 = new MoveCE(2,CEType.Basic,null,null);
		c1.addSubEffect(new AmbushCE(1,2));
		
		MoveCE c2 = new MoveCE(4,CEType.Stronger,ManaColor.Green,null);
		c2.addSubEffect(new AmbushCE(2,4));
		ce.add(c1);
		ce.add(c2);
		return ce;
	}

}
