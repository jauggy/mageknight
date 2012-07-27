package com.example.altem.mages;

public class GameContext {
	private static GameContext ref;
	public static GameContext getGameContext()
	{
		if(ref==null)
			ref = new GameContext();
		return ref;
	}
	
	@Override
	public Object clone()
			throws CloneNotSupportedException
		  {
		    throw new CloneNotSupportedException(); 
		    // that'll teach 'em
		  }
	

}
