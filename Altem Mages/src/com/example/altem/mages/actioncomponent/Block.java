package com.example.altem.mages.actioncomponent;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.cards.CEType;
import com.example.altem.mages.enemies.ElementType;

public class Block extends ActionComponent {

	private ElementType blockColor;

	public double getAdjustedValue(ElementType attackColor){
		if(isEfficient(attackColor))
			return value;
		else
			return value/2;
	}
	
	public boolean isEfficient(ElementType attackColor){
		if(attackColor == ElementType.ColdFire){
			return blockColor ==ElementType.ColdFire;
		}
		else if(attackColor == ElementType.Fire){
			return (blockColor== ElementType.Ice || blockColor==ElementType.ColdFire);
		}
		else if(attackColor == ElementType.Ice){
			return (blockColor == ElementType.Fire||blockColor == ElementType.ColdFire);
		}
		else
			return true;
	}
}
