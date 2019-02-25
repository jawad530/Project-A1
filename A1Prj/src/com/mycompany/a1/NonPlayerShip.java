package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;
import java.util.Random;
import com.codename1.charts.util.ColorUtil;

public class NonPlayerShip extends MovableObject{
	
	private MissileLauncher launcher;
	
	//initial location and direction for nonPlayerShip is random
	private Random ran = new Random();
	
	// Missiles are a set amount to begin with
	private int maxMissileCount = 10;
	
	public NonPlayerShip(double xCord, double yCord)
	{
		
		 launcher = new FixedMissileLauncher(this);
		 
		
		//Location of player Ship
		this.setXLoc(ran.nextInt(1024));
		this.setYLoc(ran.nextInt(768));
		//speed and its initial direction
		this.setObjectDirection(ran.nextInt()); // random
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