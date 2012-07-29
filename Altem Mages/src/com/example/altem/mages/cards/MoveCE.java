package com.example.altem.mages.cards;

import com.example.altem.mages.ManaColor;

public class MoveCE extends SimpleCE{

	public MoveCE(double value, CEType type, ManaColor c1, ManaColor c2) {
		super(value, type, c1, c2);
		// TODO Auto-generated constructor stub
	}

	public MoveCE(double value, ManaColor color) {
		super(value, color);
		// TODO Auto-generated constructor stub
	}

	public MoveCE(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		gameContext.generateMove(value);
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Move;
	}

}
