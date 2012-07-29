package com.example.altem.mages;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.altem.mages.cards.GainCardCE.GainCardRestriction;
import com.example.altem.mages.cards.NonWoundCard;
import com.example.altem.mages.cards.Unit;
import com.example.altem.mages.enemies.Enemy;

public class GameContext {
	private static GameContext ref;
	private RequirementFactory requirementFactory = new RequirementFactory();

	public static GameContext getGameContext() {
		if (ref == null)
			ref = new GameContext();
		return ref;
	}

	/*
	 * Necessary for Singleton pattern(non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		// that'll teach 'em
	}

	private int uniqueCounter = 0;

	public int getUniqueCounter() {
		uniqueCounter++;
		return uniqueCounter;
	}

	public boolean inCombat() {
		return (this.phase.toString().contains("Combat"));
	}

	private Phase phase;

	public void setPhase(Phase phase) {
		this.phase = phase;
	}

	public Phase getPhase() {
		return phase;
	}

	/*
	 * Deprecated: use CEAvailability instead
	 */
	public boolean canPerformAction(ActionType type) {
		switch (type) {
		case Move:
			return phase.equals(Phase.PreAction);
		case Influence:
			return phase.equals(Phase.Influence);
		case Attack:
			return phase.equals(Phase.Combat_Attack);
		case Block:
			return phase.equals(Phase.Combat_Block);
		case Heal:
			return !inCombat();
		case RangedAttack:
		case SiegeAttack:
			return phase.equals(Phase.Combat_Attack)
					|| phase.equals(Phase.Combat_Ranged);

		}
		return true;
	}

	// ----------------GETTING STUFF-----------------------------------
	HashMap<String, UniqueNameable> uniqueMap = new HashMap<String, UniqueNameable>();

	public void addUniqueNameableToWorld(UniqueNameable u) {
		uniqueMap.put(u.getUniqueName(), u);
	}

	public UniqueNameable getUniqueNameableByName(String uniqueName) {
		return uniqueMap.get(uniqueName);
	}

	// --------------------MANA--------------------
	public ArrayList<ManaConsumable> getUseableMana(ManaColor color) {
		return null;
	}

	public ArrayList<ManaConsumable> getUseableMana(
			ColorMatchRestriction matchColor) {
		// TODO Auto-generated method stub
		return null;
	}

	public void consumeMana(ManaConsumable mana) {

	}

	public void consumeMana(String selected) {
		// TODO Auto-generated method stub

	}

	// -----------------ENEMIES--------------------
	public void setTargettedEnemy(String uniqueName) {

	}

	public Enemy getTargettedEnemy() {
		return null;
	}

	public ArrayList<Enemy> getTargettableEnemies() {
		return null;
	}

	private ArrayList<ICardListener> cardListeners = new ArrayList<ICardListener>();

	public void registerCardListener(ICardListener c) {
		cardListeners.add(c);
	}

	public void deregisterCardListener(ICardListener c) {
		cardListeners.remove(c);
	}

	// -------------------CARDS----------------------------
	private NonWoundCard selectedCard;

	public void discardCard(Card card) {

	}

	public Card getSelectedCard() {
		return null;
	}

	public void executeCard(String executeEffect) {
		for (ICardListener l : cardListeners) {
			l.onCardPreExecute(selectedCard);
		}

		selectedCard.executeCardEffect(executeEffect);
		for (ICardListener li : cardListeners) {
			li.onCardPostExecute(selectedCard);
		}

		// move card to floor unless it is buffed by maximal effect
	}

	public ArrayList<Card> getCardsInHand() {
		return null;
	}

	public ArrayList<Card> getActionCardsInHand() {
		return null;
	}

	public ArrayList<Card> getCardsInHand(ColorMatchRestriction loc) {
		return null;
	}
	
	// ---------CARDS LOCATIONS-------------------------

	public void moveCardToLocation(String uniqueName, CardLocation loc) {

	}

	public ArrayList<Card> getCardsByLocation(CardLocation loc) {
		return null;
	}

	private String nextViewToLoad;

	private String getNextViewToLoad() {
		return null;
	}

	public void setNextViewToLoad(String s) {

	}

	public void showGainCardView(CardLocation from, CardLocation to,
			GainCardRestriction restriction) {

	}

	// ---------------GENERATION----------------------
	public void generateMove(double value) {

	}

	public void modifyReputation(double value) {

	}

	public void generateHeal(double value) {

	}

	public void modifyFame(double d) {
		// TODO Auto-generated method stub

	}

	public void generateInfluence(int value) {
		// TODO Auto-generated method stub

	}



	// --------------------REGISTER LISTENERS--------------------------------
	ArrayList<IEndTurnListener> endTurnListeners = new ArrayList<IEndTurnListener>();

	public void registerEndTurnListener(IEndTurnListener l) {
		endTurnListeners.add(l);
	}

	public void deregisterEndTurnListener(IEndTurnListener l) {
		endTurnListeners.remove(l);
	}

	public int getUnitsRecruitedThisTurn() {
		return 0;
	}

	public ArrayList<Unit> getUnits() {
		// TODO Auto-generated method stub
		return null;
	}

	private ManaColor cardGainMana;

	public void setCardGainMana(String selected) {
		// TODO Auto-generated method stub

	}

}
