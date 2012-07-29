package com.example.altem.mages.choices;

import com.example.altem.mages.ActionType;
import com.example.altem.mages.Phase;

public  class AttackChoice extends Choice{

	public AttackChoice() {
		super(ActionType.Attack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return "Attack";
	}

}
