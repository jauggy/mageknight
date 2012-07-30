package com.example.altem.mages.cards;

import java.util.ArrayList;

import com.example.altem.mages.ActionType;
import com.example.altem.mages.ColorMatchRestriction;
import com.example.altem.mages.ManaColor;
import com.example.altem.mages.RequirementTable;
import com.example.altem.mages.UniqueHelper;
import com.example.altem.mages.UniqueNameable;
import com.example.altem.mages.requirement.CardGainManaRequirement;
import com.example.altem.mages.viewmodel.CardEffectDTO;
import com.example.altem.mages.viewmodel.DTO;

public abstract class CardEffect extends UniqueNameable {
	//Determines when useable
	private ActionType actionType;
	private String dropDownText;
	private String displayLabel;
	private ArrayList<CardEffect> subEffects;
	protected RequirementTable requirementTable;
	protected CEType ceType = CEType.Basic;
	private boolean isVisible;
	
	/*
	 * Use blank constructor for sub effects
	 */
	public CardEffect(){
	
	}
	public CardEffect(CEType type, ManaColor primary, ManaColor secondary){
		this.displayLabel = type.toString();
		if(primary!=null)
		this.requirementTable.addPrimaryManaRequirement(primary);
		if(secondary!=null)
		this.requirementTable.addSecondaryManaRequirement(secondary);
		
		this.ceType = type;
	}
	
	public CEType getCEType(){
		return ceType;
	}
	
	public CardEffect(String displayLabel){
		this.displayLabel = displayLabel;
	}

	public void Execute(){
		ExecutePrimary();
		for(CardEffect ce : subEffects)
			ce.Execute();
	}
	
	protected abstract void ExecutePrimary();
	
	public void addSubEffect(CardEffect ce){
		subEffects.add(ce);
	}
	
	
	public void addDiscardRequirement(){
		requirementTable.addDiscardRequirement();
	}
	
	public void addThrowRequirement(ColorMatchRestriction res){
		this.requirementTable.addThrowRequirement(res);
	}
	
	
	public String getDisplayLabel(){
		return displayLabel;
	}
	
	public void hidePrimaryManaRequirement(){
		this.requirementTable.hidePrimaryManaRequirement();
	}
	
	public void reset(){
		this.isVisible = true;
		this.requirementTable.reset();
	}
	
	
	public abstract CEAvailability getAvailability();
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	public void addCardGainManaRequirement(ColorMatchRestriction res){
		this.requirementTable.addRequirement(new CardGainManaRequirement(res));
	}
	
	public DTO toDTO(){
		CardEffectDTO c = new CardEffectDTO(this);
		c.Requirements = UniqueHelper.toDTOArray(this.requirementTable.getRequirements());
		return c;
	}
}
