package game.engine.base;

import game.engine.interfaces.Attackee;

public class Wall implements Attackee {
	private final int baseHealth;
	private int currentHealth;
	
	public Wall(int baseHealth){
		this.baseHealth=baseHealth;
		this.currentHealth=baseHealth;
	}

	@Override
	public int getCurrentHealth() {
		// TODO Auto-generated method stub
		return currentHealth;
	}

	@Override
	public void setCurrentHealth(int Health) {
		if(Health<0)
			this.currentHealth=0;
			else
				this.currentHealth=Health;
		
	}

	@Override
	public int getResourcesValue() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int getBaseHealth() {
		return baseHealth;
	}
	
}
