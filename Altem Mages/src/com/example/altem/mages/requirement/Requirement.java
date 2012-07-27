package com.example.altem.mages.requirement;

import java.util.ArrayList;

import com.example.altem.mages.GameContextDependant;

//Cards effects can have requirements such as mana cost etc.
public abstract class Requirement extends GameContextDependant {
	
	public boolean isFulfillable()
	{
		return getSelectables().size()>0;
	}
	public abstract String getLabelForSelect();
	public abstract ArrayList<String> getSelectables();
	public abstract void execute(String selectable);
}
