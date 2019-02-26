package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;


public class Missile extends MovableObject {
	
	private int missileFuel = 10;
	
	public Missile(double xLocation, double yLocation, float direction)
	{
		this.setXLoc(xLocation);
		this.setXLoc(yLocation);
		this.setObjectSpeed(10);
		this.setObjectDirection(direction);
		this.setObjectColor(ColorUtil.GREEN);
	}
	
	// setters
	
	public void setMissileFuel(int fuel)
	{
		this.missileFuel = fuel;
	}
	
	// getters
	public int getMissileFuel()
	{
		return missileFuel;
	}
	
	
	//toString Change later
	public String toString()
	{
		return "Missile: " + super.toString() + " fuel=" + missileFuel;
	}
	
}
