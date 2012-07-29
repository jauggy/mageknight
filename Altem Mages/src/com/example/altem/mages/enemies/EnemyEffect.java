package com.example.altem.mages.enemies;

public abstract class EnemyEffect {
	private EnemyEffectTime effectTime;

	public EnemyEffectTime getEffectTime() {
		return effectTime;
	}

	public void setEffectTime(EnemyEffectTime effectTime) {
		this.effectTime = effectTime;
	}
	
	public abstract void executeEffect(Enemy enemy);
	
}
