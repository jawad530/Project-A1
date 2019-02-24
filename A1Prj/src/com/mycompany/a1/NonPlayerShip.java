package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;

public class NonPlayerShip extends MovableObject{
	
private MissileLauncher launcher;
	
	// Missiles are a set ammount to begin with
	private int maxMissileCount = 10;
	
	public NonPlayerShip(double xCord, double yCord)
	{
		
		 launcher = new FixedMissileLauncher(this);
		 
		
		//Location of player Ship
		this.setXLoc(xCord/2);
		this.setYLoc(yCord/2);
		//speed and its initial direction
		this.setObjectDirection(0); // random
		this.setObjectSpeed(0);
		//Color of PlayerShip
		this.setObjectColor(ColorUtil.BLUE);
	}
	
	//methods
	public void accelerationUpdate(int accelUpdate)
	{
		int speed = this.getObjectSpeed();
		int newSpeed = speed + accelUpdate;
		this.setObjectSpeed(newSpeed);
		//keep an eye on this method
	}
	
	//Setters
	public void setPlayerShipMissiles(int missiles)
	{
		maxMissileCount = missiles;
	}
	
	//getters
	public int getCurrentShipMissiles()
	{
		return this.maxMissileCount;
	}
	
	
	//toString Method
	public String toString()
	{
		return null; //WORK ON THIS LATER
	}

}