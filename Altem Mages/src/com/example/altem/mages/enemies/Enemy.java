package com.example.altem.mages.enemies;

import java.util.ArrayList;

import com.example.altem.mages.UniqueNameable;
import com.example.altem.mages.actioncomponent.Attack;
import com.example.altem.mages.actioncomponent.Block;
import com.example.altem.mages.viewmodel.DTO;

public class Enemy extends UniqueNameable{
	private boolean disabled;
	private ArrayList<EnemyEffect> enemyEffects = new ArrayList<EnemyEffect>();
	private int armor;
	private int adjustedBlockCount;
	private ElementType attackColor;
	private int adjustedAttackCount;
	private Resistance resistance;
	private String displayLabel;
	
	public Enemy(){

	}
	
	public void addAttack(Attack attack){
		adjustedAttackCount += attack.getAdjustedValue(resistance);
	}
	private void addBlock(Block block){
		adjustedBlockCount += block.getAdjustedValue(this.attackColor);
	}
	private void addEffect(EnemyEffect e){
		enemyEffects.add(e);
	}
	public void resolveBlock(){
		for(EnemyEffect e:enemyEffects){
			if(e.getEffectTime()==EnemyEffectTime.ResolveBlock){
				e.executeEffect(this);
			}
		}
	}
	public void getDamage(){
		
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public void disable(){
		this.disabled = true;
	}
	public boolean isBlocked(){
		return adjustedBlockCount >= armor;
	}
	public String getDisplayLabel() {
		// TODO Auto-generated method stub
		return displayLabel;
	}

	@Override
	public DTO toDTO() {
		// TODO Auto-generated method stub
		return new DTO(this);
	}
	
	
}
