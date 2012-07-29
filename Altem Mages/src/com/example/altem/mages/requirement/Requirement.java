package com.example.altem.mages.requirement;

import java.util.ArrayList;

import com.example.altem.mages.IUniqueNameable;
import com.example.altem.mages.UniqueNameable;

//Cards effects can have requirements such as mana cost etc.
public abstract class Requirement extends UniqueNameable implements IUniqueNameable {
	private String displayLabel;
	private String selected;
	private boolean isVisible;
	public Requirement() {
		// TODO Auto-generated constructor stub
	}
	public boolean isFulfillable()
	{
		return getSelectables().length>0;
	}
	//name of a control cannot contain white space.
	public abstract String getDisplayLabel() ;
	public abstract IUniqueNameable[] getSelectables();
	public void updateAndExecute(String selected){
		if(isVisible)
		{
			this.selected = selected;
			execute();
		}
	}
	protected abstract void execute();
	
	public  RequirementDTO toDTO(){
		IUniqueNameable[] selectables = getSelectables();
		return new RequirementDTO(uniqueName, getDisplayLabel(), selectables) ;
	}
	
	public String getSelected(){
		return this.selected;
	}
	
	public boolean isSelected(String lookFor){
		return this.selected.equalsIgnoreCase(lookFor);
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	
}
