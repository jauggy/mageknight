package com.example.altem.mages.advancedaction;

import java.util.ArrayList;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.actioncomponent.Block;
import com.example.altem.mages.cards.AttackCE;
import com.example.altem.mages.cards.BlockCE;
import com.example.altem.mages.cards.CEType;
import com.example.altem.mages.cards.CardEffect;
import com.example.altem.mages.cards.DeedCard;
import com.example.altem.mages.cards.InfluenceCE;
import com.example.altem.mages.cards.MoveCE;


public class AdvancedAction14 extends DeedCard{
	public AdvancedAction14() {
		super("PURE MAGIC");
		// TODO Auto-generated constructor stub
	}


	@Override
	protected String initBasicText() {
		// TODO Auto-generated method stub
		return "When you play this, pay mana. If you paid green, Move 4. If you paid white, Influence 4. If you paid Blue, Block 4. If you paid Red, Attack 4.";
	}

	@Override
	protected String initStrongerText() {
		// TODO Auto-generated method stub
		return  "When you play this, pay mana. If you paid green, Move 7. If you paid white, Influence 7. If you paid Blue, Block 7. If you paid Red, Attack 7.";
	}

	public ArrayList<CardEffect> initCardEffects(){
		ArrayList<CardEffect> e = new ArrayList<CardEffect>();
		e.add(new MoveCE(4,CEType.Basic, null,(ManaColor.Green)));
		e.add(new InfluenceCE(4,CEType.Basic, null, (ManaColor.White)));
		e.add(new AttackCE(4, CEType.Basic, null, (ManaColor.Red)));
		e.add(new BlockCE(4, CEType.Basic,null,  (ManaColor.Red)));
		
		
		e.add(new MoveCE(7,CEType.Stronger, ManaColor.Blue, (ManaColor.Green)));
		e.add(new InfluenceCE(7,CEType.Stronger, ManaColor.Blue, (ManaColor.White)));
		e.add(new AttackCE(7, CEType.Stronger, ManaColor.Blue, (ManaColor.Red)));
		e.add(new BlockCE(7, CEType.Stronger, ManaColor.Blue, (ManaColor.Red)));	
		return e;
	}

	@Override
	public CardEffect getEffectInPlay() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return null;
	}



}
