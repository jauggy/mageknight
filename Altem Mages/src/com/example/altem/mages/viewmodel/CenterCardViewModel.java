package com.example.altem.mages.viewmodel;


import java.util.ArrayList;

import com.example.altem.mages.GameContextDependent;
import com.example.altem.mages.cards.Card;
import com.example.altem.mages.jsinterface.NameValuePair;
import com.google.gson.Gson;

/*
 * This viewmodel contains information on one card
 */
public class CenterCardViewModel extends GameContextDependent implements IViewModel{

	@Override
	public void onLoad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getHtmlFilename() {
		// TODO Auto-generated method stub
		return "cardview.html";
	}

	@Override
	public String getJSON() {
		// TODO Auto-generated method stub
		Card c = this.gameContext.getSelectedCard();
		DTO dto = c.toDTO();
		Gson gson = new Gson();
		return gson.toJson(dto);
	}

	@Override
	public IViewModel getNextView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onSubmitForm(ArrayList<NameValuePair> pairList) {
		// TODO Auto-generated method stub
		
	}

}
