package com.example.altem.mages;

import com.example.altem.mages.requirement.Requirement;

public abstract class Card extends UniqueNameable{
	protected String displayLabel;
	public Card(String displayLabel){
		this.displayLabel = displayLabel;
	}
	public String getDisplayLabel(){
		return displayLabel;
	}
}
