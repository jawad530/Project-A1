package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;

public class PlayerShip extends MovableObject implements ISteerable {

	private MissileLauncher launcher;
	
	// Missiles are a set ammount to begin with
	private int maxMissileCount = 10;
	
	public PlayerShip(double xCord, double yCord)
	{
		
		 launcher = new SteerableMissileLauncher(this);
		 
		
		//Location of player Ship
		this.setXLoc(xCord/2);
		this.setYLoc(yCord/2);
		//speed and its initial direction
		this.setObjectDirection(0);
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
	
	public void directionUpdate(int dirUpdate)
	{
		double direction = this.getObjectDirection();
		//right turn
		if (dirUpdate >= 0)
		{
			this.setObjectDirection((float)direction + 5);
		}
		// left turn
		if (dirUpdate < 0)
		{
			this.setObjectDirection((float)direction - 5);
		}
		
		//360 turn?
		//monitor this method
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
		return "PlayerShip: " + super.toString() + " Missiles" + maxMissileCount;
	}
	
}