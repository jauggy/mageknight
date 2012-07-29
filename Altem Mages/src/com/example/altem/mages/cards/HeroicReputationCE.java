package com.example.altem.mages.cards;

import com.example.altem.mages.IEndTurnListener;

public class HeroicReputationCE extends CardEffect implements IEndTurnListener {

	double reputationBonus;
	double fameBonus;
	public HeroicReputationCE(double reputationbonus,double famebonus){
		reputationBonus =reputationBonus;
		fameBonus = famebonus;
	}
	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Any;
	}

	public void onEndTurn() {
		// TODO Auto-generated method stub
		gameContext.modifyReputation(gameContext.getUnitsRecruitedThisTurn()*reputationBonus);
		gameContext.modifyFame(gameContext.getUnitsRecruitedThisTurn()*fameBonus);
	}

}
