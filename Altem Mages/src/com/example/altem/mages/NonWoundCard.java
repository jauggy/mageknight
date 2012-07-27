package com.example.altem.mages;

public abstract class NonWoundCard {
	
	//called by jquery when user submits form to use the card
	//dropdown name: effect
	//requirement dropdown name: requirement name
	public void use()
	{
		//nothing. The JSInterface will call requirement.execute and effect.execute instead of 
		//using anything of the card.
	}
}
