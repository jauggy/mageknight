package com.example.altem.mages;

import com.example.altem.mages.cards.NonWoundCard;

public interface ICardListener {
	public void onCardPostExecute(NonWoundCard selectedCard);
	public void onCardPreExecute(NonWoundCard selectedCard);
}
