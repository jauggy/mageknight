package com.example.altem.mages.cards;

public class ReputationCE extends CardEffect {

	private double value;
	public ReputationCE(double value){
		this.value = value;
	}
	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		gameContext.modifyReputation(value);
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Any;
	}
	
}
