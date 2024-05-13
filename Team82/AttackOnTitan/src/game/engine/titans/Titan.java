package game.engine.titans;

import game.engine.interfaces.Attackee;
import game.engine.interfaces.Attacker;
import game.engine.interfaces.Mobil;;

 public abstract class Titan implements Comparable<Titan>,Attackee,Attacker,Mobil {
	private final int baseHealth;
	private int currentHealth;
	private final int baseDamage;
	private final int heightInMeters;
	private int distanceFromBase;
	private int speed;
	private final int resourcesValue;
	private final int dangerLevel;

public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int
speed, int resourcesValue, int dangerLevel){
	this.baseHealth=baseHealth;
	this.baseDamage=baseDamage;
	this.distanceFromBase=distanceFromBase;
	this.speed=speed;
	this.resourcesValue=resourcesValue;
	this.dangerLevel=dangerLevel;
	this.currentHealth=baseHealth;
	this.heightInMeters=heightInMeters;
	
}
public int getBaseHealth() {
	return baseHealth;
}



public void setDistanceFromBase(int distanceFromBase) {
	this.distanceFromBase = distanceFromBase;
}




public int getHeightInMeters() {
	return heightInMeters;
}

public int getDangerLevel() {
	return dangerLevel;
}



@Override
public int getDistance() {
	return distanceFromBase;
}

@Override
public void setDistance(int distance) {
	this.distanceFromBase=distance;
}

@Override
public int getSpeed() {

	return speed;
}


@Override
public void setSpeed(int speed) {
	this.speed=speed;
	
}


@Override
public int getDamage() {
	return baseDamage;
}


@Override
public int getCurrentHealth() {
	return currentHealth;
}


@Override
public void setCurrentHealth(int currentHealth) {
	if(currentHealth<0){
		currentHealth=0;
	}
	this.currentHealth=currentHealth;	
}


@Override
public int getResourcesValue() {
	return resourcesValue;
}


@Override
public int compareTo(Titan o) {
	// TODO Auto-generated method stub
	return this.distanceFromBase-o.distanceFromBase;
}


}
