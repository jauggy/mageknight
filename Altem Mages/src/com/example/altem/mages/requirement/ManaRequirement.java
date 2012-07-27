package com.example.altem.mages.requirement;

import java.util.ArrayList;
import com.example.altem.mages.ManaColour;

public class ManaRequirement extends Requirement {

	private ManaColour manaColour;
	public ManaRequirement(ManaColour mc){
		this.manaColour = mc;
	}
	@Override
	public String getLabelForSelect() {
		// TODO Auto-generated method stub
		return "Mana";
	}

	@Override
	public ArrayList<String> getSelectables() {
		// TODO Auto-generated method stub
		//Find
		return null;
	}
	@Override
	public void execute(String selectable) {
		// TODO Auto-generated method stub
		
	}

}
