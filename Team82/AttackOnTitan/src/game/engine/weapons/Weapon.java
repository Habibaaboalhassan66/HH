package game.engine.weapons;

abstract public class Weapon {
	private final int baseDamage;
	
	public Weapon(int baseDamage){
		this.baseDamage=baseDamage;
	}

	public int getDamage() {
		return baseDamage;
	}

	
}
