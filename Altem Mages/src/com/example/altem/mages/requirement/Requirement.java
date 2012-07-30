package com.example.altem.mages.requirement;

import com.example.altem.mages.IUniqueNameable;
import com.example.altem.mages.UniqueHelper;
import com.example.altem.mages.UniqueNameable;
import com.example.altem.mages.viewmodel.DTO;
import com.example.altem.mages.viewmodel.RequirementDTO;

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
	
	public DTO toDTO(){
		RequirementDTO r = new RequirementDTO(this);
		r.Selectables = UniqueHelper.toDTOArray(this.getSelectables());
		return r;
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
