package com.example.altem.mages.actioncomponent;

import java.util.ArrayList;

import com.example.altem.mages.enemies.AttackType;
import com.example.altem.mages.enemies.ElementType;
import com.example.altem.mages.enemies.Resistance;

public class Attack extends ActionComponent {

	private ElementType attackColor;
	private AttackType attackType;
	public Attack(double value, AttackType type, ElementType color){
		attackColor = color;
		attackType = type;
		this.value = value;
	}
	
	public Attack(double i, AttackType type) {
		// TODO Auto-generated constructor stub
		this(i,type,ElementType.Physical);
	}

	public double getAdjustedValue(Resistance resistances){
		if(isEfficient(resistances))
			return value;
		else
			return value/2;
	}
	
	public boolean isEfficient(Resistance resistances){
		return resistances.isResistantTo(attackColor);
	}

}
