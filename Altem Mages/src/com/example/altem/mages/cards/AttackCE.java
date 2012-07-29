package com.example.altem.mages.cards;

import com.example.altem.mages.IValueHolder;
import com.example.altem.mages.ManaColor;
import com.example.altem.mages.actioncomponent.Attack;
import com.example.altem.mages.enemies.Enemy;

public class AttackCE extends CardEffect implements IValueHolder {
	private Attack attack;
	public AttackCE(int value, CEType cardEffectType, ManaColor cost){
		this(value,cardEffectType,cost,null);
	}
	
	public AttackCE(int value, CEType cardEffectType, ManaColor cost, ManaColor cost2){
		super(cardEffectType,cost,cost2);
		this.requirementTable.addTargetEnemyRequirement();
	}
	
	public AttackCE(Attack attack, CEType cardEffectType, ManaColor cost, ManaColor cost2){
		super(cardEffectType, cost, cost2);
		this.attack = attack;
	}
	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		Enemy e =gameContext.getTargettedEnemy();
		e.addAttack(attack);
	}
	
	public void increaseValue(double attackModifier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Attack;
	}
	
}
