package com.example.altem.mages.cards;

import com.example.altem.mages.ManaColor;

public abstract class SimpleCE extends CardEffect {
	protected double value;
	public SimpleCE(double value, CEType type, ManaColor c1, ManaColor c2) {
		super(type, c1, c2);
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	public SimpleCE(double value){
		this(value,CEType.Basic,null,null);
	}
	
	public SimpleCE(double value, ManaColor color){
		this(value,CEType.Stronger,color,null);
	}


}
