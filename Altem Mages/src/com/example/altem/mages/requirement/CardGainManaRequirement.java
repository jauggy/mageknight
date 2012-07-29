package com.example.altem.mages.requirement;

import java.util.ArrayList;

import com.example.altem.mages.ColorMatchRestriction;
import com.example.altem.mages.IUniqueNameable;
import com.example.altem.mages.ManaConsumable;
import com.example.altem.mages.requirement.ManaRequirement.ManaRequirementType;

public class CardGainManaRequirement extends Requirement{
	ColorMatchRestriction res;
	
	public CardGainManaRequirement(ColorMatchRestriction res){

		this.res = res;
	}
	@Override
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return "Card color mana";
	}

	@Override
	public IUniqueNameable[] getSelectables() {
		// TODO Auto-generated method stub
		ArrayList<ManaConsumable> stuff;

		stuff= this.gameContext.getUseableMana(res);
	
		return stuff.toArray(new IUniqueNameable[stuff.size()]);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		gameContext.consumeMana(getSelected());
		gameContext.setCardGainMana(this.getSelected());
	}

}
