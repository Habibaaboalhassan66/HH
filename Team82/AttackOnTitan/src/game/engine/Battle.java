package game.engine;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

import game.engine.base.Wall;
import game.engine.dataloader.DataLoader;
import game.engine.lanes.Lane;
import game.engine.titans.Titan;
import game.engine.titans.TitanRegistry;
import game.engine.weapons.factory.WeaponFactory;
public class Battle {

	private final static int[][]PHASES_APPROACHING_TITANS= new int [][] {{1,1,1,2,1,3,4},{2,2,2,1,3,3,4},{4,4,4,4,4,4,4}};
	private final static int WALL_BASE_HEALTH=10000;
	private int numberOfTurns;
	private int resourcesGathered;
	private BattlePhase battlePhase;
	private int numberOfTitansPerTurn=1;
	private int score;
	private int titanSpawnDistance;
	private final WeaponFactory weaponFactory;
	private int initialNumOfLanes;
	private int initialResourcesPerLane;
	private final HashMap<Integer, TitanRegistry> titansArchives = DataLoader.readTitanRegistry();
	private final ArrayList<Titan> approachingTitans;
	private final PriorityQueue<Lane> lanes;
	private final ArrayList<Lane> originalLanes;
	
	public Battle (int numberOfTurns, int score, int titanSpawnDistance, int initialNumOfLanes,
			int initialResourcesPerLane) throws IOException{
		this.numberOfTurns=numberOfTurns;
		this.score=score;
		this.titanSpawnDistance=titanSpawnDistance;
		this.initialNumOfLanes=initialNumOfLanes;
		this.initialResourcesPerLane=initialResourcesPerLane;
		this.resourcesGathered= initialResourcesPerLane*initialNumOfLanes;
		this.battlePhase=battlePhase.EARLY;
		this.weaponFactory= new WeaponFactory();
		this.approachingTitans= new ArrayList<Titan>();
		this.lanes= new PriorityQueue<Lane>();
		this.originalLanes= new ArrayList<Lane>();
		initializeLanes(initialNumOfLanes);
	}
	
	
	private void initializeLanes(int numOfLanes){
		for(int i=0;i<numOfLanes;i++){
			Wall wall= new Wall(WALL_BASE_HEALTH);
			Lane lane=new Lane(wall);
			lanes.add(lane);
			originalLanes.add(lane);
		}
		
		
	}


	public int[][] getPHASES_APPROACHING_TITANS() {
		return PHASES_APPROACHING_TITANS;
	}


	public int getWALL_BASE_HEALTH() {
		return WALL_BASE_HEALTH;
	}



	public int getNumberOfTurns() {
		return numberOfTurns;
	}


	public void setNumberOfTurns(int numberOfTurns) {
		this.numberOfTurns = numberOfTurns;
	}


	public int getResourcesGathered() {
		return resourcesGathered;
	}


	public void setResourcesGathered(int resourcesGathered) {
		this.resourcesGathered = resourcesGathered;
	}


	public BattlePhase getBattlePhase() {
		return battlePhase;
	}


	public void setBattlePhase(BattlePhase battlePhase) {
		this.battlePhase = battlePhase;
	}


	public int getNumberOfTitansPerTurn() {
		return numberOfTitansPerTurn;
	}


	public void setNumberOfTitansPerTurn(int numberOfTitansPerTurn) {
		this.numberOfTitansPerTurn = numberOfTitansPerTurn;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getTitanSpawnDistance() {
		return titanSpawnDistance;
	}


	public void setTitanSpawnDistance(int titanSpawnDistance) {
		this.titanSpawnDistance = titanSpawnDistance;
	}


	public WeaponFactory getWeaponFactory() {
		return weaponFactory;
	}





	public int getInitialNumOfLanes() {
		return initialNumOfLanes;
	}


	public void setInitialNumOfLanes(int initialNumOfLanes) {
		this.initialNumOfLanes = initialNumOfLanes;
	}


	public int getInitialResourcesPerLane() {
		return initialResourcesPerLane;
	}


	public void setInitialResourcesPerLane(int initialResourcesPerLane) {
		this.initialResourcesPerLane = initialResourcesPerLane;
	}


	public HashMap<Integer, TitanRegistry> getTitansArchives() {
		return titansArchives;
	}



	public ArrayList<Titan> getApproachingTitans() {
		return approachingTitans;
	}





	public PriorityQueue<Lane> getLanes() {
		return lanes;
	}




	public ArrayList<Lane> getOriginalLanes() {
		return originalLanes;
	}



	}
