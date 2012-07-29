package com.example.altem.mages.advancedaction;

import java.util.ArrayList;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.cards.AttackCE;
import com.example.altem.mages.cards.CEType;
import com.example.altem.mages.cards.CardEffect;
import com.example.altem.mages.cards.DeedCard;
import com.example.altem.mages.cards.InfluenceCE;
import com.example.altem.mages.cards.ReputationCE;

public class AdvancedAction09 extends DeedCard{

	public AdvancedAction09() {
		super("INTIMIDATE");
		// TODO Auto-generated constructor stub
	}
	

	@Override
	protected String initBasicText() {
		// TODO Auto-generated method stub
		return "Influence 4 or Attack 3. Get Reputation -1 at the end of your turn.";
	}

	@Override
	protected String initStrongerText() {
		// TODO Auto-generated method stub
		return "Influence 8 or Attack 7. Get Reputation -2 at the end of your turn.";
	}

	@Override
	public ArrayList<CardEffect> initCardEffects() {
		// TODO Auto-generated method stub
		ArrayList<CardEffect> ce = new ArrayList<CardEffect>();
		ReputationCE rep = new ReputationCE(-1);
		InfluenceCE i = new InfluenceCE(4,CEType.Basic,null,null);
		i.addSubEffect(rep);
		AttackCE a = new AttackCE(3,CEType.Basic,null,null);
		a.addSubEffect(rep);
		
		ReputationCE rep2 = new ReputationCE(-2);
		InfluenceCE i2 = new InfluenceCE(8,CEType.Basic,ManaColor.Red,null);
		AttackCE a2 = new AttackCE(7,CEType.Basic,ManaColor.Red,null);
		i2.addSubEffect(rep2);
		a2.addSubEffect(rep2);
		
		ce.add(i2);
		ce.add(a2);
		return ce;
	}

}
