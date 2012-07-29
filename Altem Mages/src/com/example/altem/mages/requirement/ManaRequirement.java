package com.example.altem.mages.requirement;

import java.util.ArrayList;

import com.example.altem.mages.ColorMatchRestriction;
import com.example.altem.mages.IUniqueNameable;
import com.example.altem.mages.ManaColor;
import com.example.altem.mages.ManaConsumable;

public class ManaRequirement extends Requirement {
	public enum ManaRequirementType{
		Primary,Secondary
	}
	protected ManaColor manaColour;
	protected ManaRequirementType requirementType;

	
	public ManaRequirement(ManaColor mc, ManaRequirementType type){
		this.manaColour = mc;
		this.requirementType = type;
	}

	@Override
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return "Mana";
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ManaConsumable ma = (ManaConsumable)gameContext.getUniqueNameableByName(this.getSelected());
		gameContext.consumeMana(ma);
		
	}
	
	@Override
	public IUniqueNameable[] getSelectables() {
		// TODO Auto-generated method stub
		ArrayList<ManaConsumable> stuff;
		
			stuff= this.gameContext.getUseableMana(manaColour);
		
		return stuff.toArray(new IUniqueNameable[stuff.size()]);
	}
	
	public boolean isPrimary(){
		return requirementType == ManaRequirementType.Primary;
	}

}
