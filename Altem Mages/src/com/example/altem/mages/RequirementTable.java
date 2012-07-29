package com.example.altem.mages;

import java.util.ArrayList;

import com.example.altem.mages.jsinterface.NameValuePair;
import com.example.altem.mages.requirement.DiscardRequirement;
import com.example.altem.mages.requirement.ManaRequirement;
import com.example.altem.mages.requirement.ManaRequirement.ManaRequirementType;
import com.example.altem.mages.requirement.Requirement;
import com.example.altem.mages.requirement.ThrowRequirement;

public class RequirementTable {
	private ManaRequirement primaryManaRequirement;
	private ArrayList<IUniqueNameable> requirements; 
	public void addPrimaryManaRequirement(ManaColor color){
		primaryManaRequirement = new ManaRequirement(color,ManaRequirementType.Primary);
		requirements.add(primaryManaRequirement);
	}
	
	public void addSecondaryManaRequirement(ManaColor color){
		requirements.add(new ManaRequirement(color,ManaRequirementType.Secondary));
	}
	
	
	public void executeRequirements(NameValuePair[] pairs){
		for(NameValuePair p:pairs)
		{
			Requirement r = (Requirement)UniqueHelper.getMatch(p.getName(), requirements);
			r.updateAndExecute(p.getValue());
		}
		
	}
	
	public void addTargetEnemyRequirement(){
		
	}

	public void addDiscardRequirement() {
		// TODO Auto-generated method stub
		requirements.add(new DiscardRequirement());
	}
	
	public void addThrowRequirement(ColorMatchRestriction res){
		requirements.add(new ThrowRequirement(res));
	}
	
	public void addRequirement(Requirement re){
		requirements.add(re);
	}
	
	public void hidePrimaryManaRequirement(){
		if(primaryManaRequirement!=null)
		primaryManaRequirement.setVisible(false);
	}
	
	public void reset(){
		if(primaryManaRequirement!=null)
		primaryManaRequirement.setVisible(true);
	}

}
