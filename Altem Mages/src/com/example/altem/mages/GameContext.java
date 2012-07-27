package com.example.altem.mages;

import java.util.ArrayList;

public class GameContext {
	private static GameContext ref;
	public static GameContext getGameContext()
	{
		if(ref==null)
			ref = new GameContext();
		return ref;
	}
	
	public Object clone()
			throws CloneNotSupportedException
		  {
		    throw new CloneNotSupportedException(); 
		    // that'll teach 'em
		  }
	
	public ArrayList<ManaConsumable> getManaConsumables(ManaColour mc)
	{
		
	}
}
