package com.example.altem.mages.requirement;

import java.util.ArrayList;

import com.example.altem.mages.IUniqueNameable;
import com.example.altem.mages.ManaConsumable;
import com.example.altem.mages.enemies.Enemy;

public class TargetEnemyRequirement extends Requirement{

	public TargetEnemyRequirement() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	/*
	 * The selectable should be the unique name of the enemy
	 */
	public void execute() {
		// TODO Auto-generated method stub
		this.gameContext.setTargettedEnemy(getSelected());
	}

	@Override
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public IUniqueNameable[] getSelectables() {
		// TODO Auto-generated method stub
		ArrayList<Enemy> stuff = this.gameContext.getTargettableEnemies();
		return stuff.toArray(new IUniqueNameable[stuff.size()]);
	}

}
