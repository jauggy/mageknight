package com.example.altem.mages;

import com.example.altem.mages.cards.Card;

public interface ICardListener {
	public void onCardPostExecute(Card selectedCard);
	public void onCardPreExecute(Card selectedCard);
}
