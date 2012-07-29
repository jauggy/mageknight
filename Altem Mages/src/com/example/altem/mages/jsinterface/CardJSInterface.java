package com.example.altem.mages.jsinterface;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.cordova.DroidGap;

import com.example.altem.mages.ManaColor;
import com.example.altem.mages.cards.NonWoundCard;
import com.example.altem.mages.requirement.ManaRequirement;
import com.example.altem.mages.requirement.Requirement;
import com.example.altem.mages.requirement.RequirementDTO;

import android.util.Log;
import android.webkit.WebView;

public class CardJSInterface extends PhoneGapInterface {

	private NonWoundCard card;
	private HashMap<String, Requirement> nameRequirementMap;
	private int uniqueKeyCounter=0;
	
	public CardJSInterface(DroidGap droidGap, WebView view) {
		super(droidGap, view);
	
	}

	@Override
	public void processForm(ArrayList<NameValuePair> pairList) {
		for(NameValuePair p :pairList){
			String name = p.getName();
			Requirement req =  nameRequirementMap.get(name);
			req.execute(p.getValue());
		}
		
	}
	
	public void setCard(NonWoundCard card){
		nameRequirementMap = new HashMap<String,Requirement>();
		ArrayList<Requirement> basicReqs = card.getBasicRequirements();
		for(Requirement r:basicReqs){
			String uniqueName = r.getDisplayLabel()+uniqueKeyCounter;
			RequirementDTO dto = r.toDTO();
			nameRequirementMap.put(uniqueName, r);
			
		}
	}
	
	public String getBasicRequirementsJSON(){
		ArrayList<Requirement> requirements = card.getBasicRequirements();
		return this.toJSONString(requirements);
	}
}
