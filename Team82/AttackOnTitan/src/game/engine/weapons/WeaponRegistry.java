package game.engine.weapons;

import game.engine.dataloader.DataLoader;

public class WeaponRegistry extends DataLoader{
	private final int code;
	private int price;
	private int damage;
	private String name;
	private int minRange;
	private int maxRange;
	
	public int getCode() {
		return code;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public int getMinRange() {
		return minRange;
	}
	public int getMaxRange() {
		return maxRange;
	}
	
	public int getDamage() {
		return damage;
	}
	public WeaponRegistry(int code, int price){
		this.code=code;
		this.price=price;
	}
	public WeaponRegistry(int code, int price, int damage, String name){
		super();
		this.code=code;
		this.price=price;
		this.damage=damage;
		this.name=name;
	}
	public WeaponRegistry(int code, int price, int damage, String name, int minRange, int maxRange){
		super();
		this.code=code;
		this.price=price;
		this.name=name;
		this.minRange=minRange;
		this.maxRange=maxRange;
	}
}
