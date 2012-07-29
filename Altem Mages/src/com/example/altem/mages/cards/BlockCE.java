package com.example.altem.mages.cards;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.actioncomponent.Block;

public class BlockCE extends CardEffect {

	private Block block;
	
	public BlockCE(int i, CEType ceType, ManaColor manaColor) {
		// TODO Auto-generated constructor stub
		super(ceType.toString());
		this.requirementTable.addManaRequirement(manaColor);
	}

	public BlockCE(int i, CEType ceType, ManaColor mc1, ManaColor mc2) {
		// TODO Auto-generated constructor stub
		super(ceType.toString());
		this.requirementTable.addManaRequirement(mc1);
		this.requirementTable.addManaRequirement(mc2);
	}

	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		
	}
	
	public void increaseValue(double d){
		block.increaseValue(d);
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Block;
	}

}
