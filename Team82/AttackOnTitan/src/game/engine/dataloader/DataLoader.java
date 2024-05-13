package game.engine.dataloader;

import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DataLoader {
	private final static String TITANS_FILE_NAME="titans.csv";
	private final static String WEAPONS_FILE_NAME="weapons.csv";
	
	
	
	
	public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException{
		HashMap<Integer, TitanRegistry> Titansmap= new HashMap<>();
		File titansFile= new File(TITANS_FILE_NAME);
		FileReader filereader= new FileReader(titansFile);
		BufferedReader bufferreader = new BufferedReader(filereader); // reads the csv file row by row
		String line;
		while((line=bufferreader.readLine())!= null){
			String[] Temp= line.split(","); //split the numbers by commas 
			int code = Integer.parseInt(Temp[0]);
			int baseHealth = Integer.parseInt(Temp[1]);
			int baseDamage = Integer.parseInt(Temp[2]);
			int heightInMeters = Integer.parseInt(Temp[3]);
			int speed = Integer.parseInt(Temp[4]);
			int resourcesValue = Integer.parseInt(Temp[5]);
			int dangerLevel = Integer.parseInt(Temp[6]);
			TitanRegistry titans= new TitanRegistry(code,baseHealth,baseDamage,heightInMeters,speed,resourcesValue,dangerLevel);
			Titansmap.put(code,titans);
		}
		bufferreader.close();
		return Titansmap;
	}
		public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() throws IOException{
			
			HashMap<Integer, WeaponRegistry> Itemshop= new HashMap<>();
			File weaponsFile= new File(WEAPONS_FILE_NAME);
			FileReader filereader2= new FileReader(weaponsFile);
			BufferedReader bufferreader2 = new BufferedReader(filereader2);
			String line1;
			while((line1=bufferreader2.readLine())!= null){
				String[] Temp= line1.split(",");
				if(Temp.length>4){
					int code = Integer.parseInt(Temp[0]);
					int price = Integer.parseInt(Temp[1]);
					int damage = Integer.parseInt(Temp[2]);
					String name = Temp[3];
					int minRange=Integer.parseInt(Temp[4]);
					int maxRange=Integer.parseInt(Temp[5]);
					WeaponRegistry weapons= new WeaponRegistry(code,price,damage,name,minRange,maxRange);
					Itemshop.put(code,weapons);

				}
				else{
					int code = Integer.parseInt(Temp[0]);
					int price = Integer.parseInt(Temp[1]);
					int damage = Integer.parseInt(Temp[2]);
					String name = Temp[3];
					WeaponRegistry weapons= new WeaponRegistry(code,price,damage,name);
					Itemshop.put(code,weapons);

				}

			}
			bufferreader2.close();
			return Itemshop;
		}
		
		
	}
