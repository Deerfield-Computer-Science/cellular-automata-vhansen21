import java.awt.Color;
import java.util.ArrayList;

import acm.util.RandomGenerator;

public abstract class LifeForm {
	
	protected World myWorld;
	protected int myLifeSpan;
	protected Location myLocation;
	protected Color myColor;
	protected int myAge;
	protected boolean alive;
	
	// lifeform constructors
	public LifeForm(int myLifeSpan, Location myLocation, Color myColor, World myWorld) {
		super();
		this.myLifeSpan = myLifeSpan;
		this.myLocation = myLocation;
		this.myColor = myColor;
		this.myWorld = myWorld;
		alive = true;
	}
	
	public LifeForm(Location myLocation, World myWorld) {
		super();
		this.myWorld = myWorld;
		this.myLocation = myLocation;
		alive = true;
	}
	
	/* all the basic lifeform functions
	 * 		getOlder
	 * 		reproduce
	 */
	
	// we all age the same, time clicks forward and we all age one unit of time
	public void age(int time){
		myAge+=time;
		if (myAge>myLifeSpan)
			alive=false;
	}
	
	// to be alive you have to be able to reproduce....
	//public abstract void reproduce();
	
	public boolean isDead(){
		return !alive;
	}
	
	// getter and setters (aka accessors and mutators)
	public int getMyLifeSpan() {
		return myLifeSpan;
	}
	
	public void setMyLifeSpan(int myLifeSpan) {
		this.myLifeSpan = myLifeSpan;
	}
	
	public Location getMyLocation() {
		return myLocation;
	}
	
	public void setMyLocation(Location myLocation) {
		this.myLocation = myLocation;
	}
	
	public void move() {
		int y; 
		int x;
		x= getMyLocation().getX()+rgen.nextInt(-1, 1);
		y= getMyLocation().getY()+rgen.nextInt(-1, 1);
		
		Location L = new Location(x, y);
		
		setMyLocation(L);
		
	}
	
	public void infect() {
		int infectivity;
		if(checker==true) {
			if(yearsOld>60) {
				infectivity=rgen.nextInt(0, 2);
				if (infectivity==1) {
					//creature is dead, new symptomatic
				}
			}
			else if(yearsOld>30) {
					infectivity=rgen.nextInt(0, 10);
					if (infectivity==1 || infectivity==2) {
						//creature is dead, new asymptomatic
					}
					if(infectivity==3) {
						//creature is dead, new symptomatic
			}
			else {
					infectivity=rgen.nextInt(0, 10);
					if (infectivity==1) {
						//creature is dead, new symptomatic
					}
					if (infectivity==2) {
						//creature is dead, new asymptomatic
					}
			}
				
			}
		}
	}
	/*	public void checkSurroundingBoxes() {
		int totalNumAdjCreatures=0;
		for (int i =0; i<creatureList.size();i++) {
			for (int j=1; j<creatureList.size();j++) {
				if ((creatureList.get(j).myLocation.getX() ==creatureList.get(i).myLocation.getX()+10) 
						&& (creatureList.get(j).myLocation.getY() ==creatureList.get(i).myLocation.getY()+10)
						&& (creatureList.get(j).getMyColor()==RED)){
					totalNumAdjCreatures++;
					
				}else if  ((creatureList.get(j).myLocation.getX() ==creatureList.get(i).myLocation.getX()-10) 
						&& (creatureList.get(j).myLocation.getY() ==creatureList.get(i).myLocation.getY()+10)) {
					totalNumAdjCreatures++;
				}else if ((creatureList.get(j).myLocation.getX() ==creatureList.get(i).myLocation.getX()+10)
						&&(creatureList.get(j).myLocation.getY() ==creatureList.get(i).myLocation.getY()-10)){
					totalNumAdjCreatures++;
				}else if((creatureList.get(j).myLocation.getX() ==creatureList.get(i).myLocation.getX()-10) 
						&& (creatureList.get(j).myLocation.getY() ==creatureList.get(i).myLocation.getY()-10)) {
					totalNumAdjCreatures++;
								
				}
				if (totalNumAdjCreatures<=2) {
					creatureList.remove(i);
					creatureList.add(i,)
				}
			}
		
		}
		
			
	}*/
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public Color getMyColor() {
		return myColor;
	}
	
	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}
	
	public int getAge() {
		return myAge;
	}

	public void setAge(int age) {
		this.myAge = age;
	}
	
	@Override
	public String toString() {
		return "LifeForm [myLifeSpan=" + myLifeSpan + ", myLocation="
				+ myLocation + ", myColor=" + myColor + "]";
	}
}
