package com.example.altem.mages;

public class ManaConsumable {
	private ManaColour manaColour;
	private ManaForm manaForm;
	public ManaColour getManaColour() {
		return manaColour;
	}
	public void setManaColour(ManaColour manaColour) {
		this.manaColour = manaColour;
	}
	public ManaForm getManaForm() {
		return manaForm;
	}
	public void setManaForm(ManaForm manaForm) {
		this.manaForm = manaForm;
	}
	
	public void consume(){
		if(manaForm==ManaForm.CRYSTAL)
		{
			
		}
		else if(manaForm==ManaForm.SOURCE)
		{
			
		}
		else if(manaForm==ManaForm.TOKEN)
		{
			
		}
	}
	
	public String toString(){
		return manaColour.toString() + " " + manaForm.toString();
	}
}