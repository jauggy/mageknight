package com.example.altem.mages.cards;

import com.example.altem.mages.enemies.Enemy;
import com.example.altem.mages.requirement.TargetEnemyRequirement;

public class DisableCE extends CardEffect{

	private TargetEnemyRequirement enemyReq = new TargetEnemyRequirement();
	@Override
	protected void ExecutePrimary() {
		// TODO Auto-generated method stub
		Enemy e = (Enemy)this.gameContext.getUniqueNameableByName(enemyReq.getSelected());
		e.disable();
	}

	@Override
	public CEAvailability getAvailability() {
		// TODO Auto-generated method stub
		return CEAvailability.Attack;
	}

}
