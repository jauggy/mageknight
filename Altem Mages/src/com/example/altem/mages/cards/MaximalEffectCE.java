package com.example.altem.mages.cards;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.requirement.BuffActionRequirement;
import com.example.altem.mages.requirement.Requirement;

public class MaximalEffectCE extends CardEffect{
	private int timesCanUseBuffCard;
	public MaximalEffectCE(int timesCanUsePerTurn, CEType type, ManaColor color){
		super(type, color, null);
		timesCanUseBuffCard= timesCanUsePerTurn;
	}
	Requirement buffReq;
	public MaximalEffectCE(){
		buffReq = new BuffActionRequirement();
		this.requirementTable.addRequirement(buffReq);
	}
	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		DeedCard d =(DeedCard)gameContext.getUniqueNameableByName(buffReq.getSelected());
		d.setOneCETypeVisible(this.ceType);
		d.setTimesCanUsePerTurn(timesCanUseBuffCard);
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return null;
	}

}
