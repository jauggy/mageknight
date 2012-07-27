package com.example.altem.mages;

import java.util.ArrayList;

public class Source {
	private int diceUsable;
	private ArrayList<ManaConsumable> diceViewable;
	private int startingDiceCount;
	
	public ArrayList<ManaConsumable> getManaConsumables(ManaColour mc)
	{
		ArrayList<ManaConsumable> returnObjs = new ArrayList<ManaConsumable>();
		for(ManaConsumable mana:diceViewable)
		{
			//if(mana.getManaColour()==mc)
				//returnObjs.add(mana);
		}
		
		return returnObjs;
	}
	
	public int getDiceUsable(){
		return diceUsable;
	}
	
	 
}
