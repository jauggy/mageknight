package com.example.altem.mages.cards;

import java.util.ArrayList;

import com.example.altem.mages.IEndTurnListener;
import com.example.altem.mages.ManaColor;

public class UnitBuffCE extends CardEffect implements IEndTurnListener{
	private int attackModifier;
	private int blockModifier;
	ArrayList<Unit> units;
	public UnitBuffCE(int attackModifier, int blockModifier, CEType type, ManaColor color){
		super(type, color,null);
		this.attackModifier = attackModifier;
		this.blockModifier = blockModifier;
	}
	
	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		units = gameContext.getUnits();
		for(Unit u:units){
			u.increaseAttack(attackModifier);
			u.increaseBlock(blockModifier);
		}
		
		gameContext.registerEndTurnListener(this);
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Any;
	}

	public void onEndTurn() {
		// TODO Auto-generated method stub
		for(Unit u:units){
			u.increaseAttack(-attackModifier);
			u.increaseBlock(-blockModifier);
		
		}
		
		gameContext.deregisterEndTurnListener(this);
	}

}
