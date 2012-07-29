package com.example.altem.mages.enemies;

public class Resistance {
	private boolean physical;
	private boolean fire;
	private boolean ice;
	
	public Resistance(boolean physical, boolean fire, boolean ice){
		
	}
	
	public boolean isResistantTo(ElementType e){
		if(e.equals(ElementType.ColdFire))
			return fire && ice;
		else if(e.equals(ElementType.Fire)){
			return fire;
		}
		else if(e.equals(ElementType.Ice)){
			return ice;
		}
		else
			return physical;
	}
}
