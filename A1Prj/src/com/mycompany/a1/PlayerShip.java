package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;

public class PlayerShip extends MovableObject implements ISteerable {

	// Missiles are a set ammount to begin with
	private int maxMissileCount = 10;
	
	public PlayerShip(double xCord, double yCord)
	{
		//Location of player Ship
		this.setXLoc(xCord/2);
		this.setYLoc(yCord/2);
		//speed and its initial direction
		this.setObjectDirection(0);
		this.setObjectSpeed(0);
		//Color of PlayerShip
		this.setObjectColor(ColorUtil.BLUE);
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
	
}