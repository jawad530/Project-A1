package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;
import java.util.Random;

public class Asteroid extends MovableObject{

	// fixed variables
	private Random ran = new Random();
	private int size = ran.nextInt(30); // change later
	
	// setters
	public void setAsteroidSize(int size)
	{
	//	this.size(size); WORK ON SIZE
	}
	
	// getters
	public int getObjectSize()
	{
		return size;
	}
	
	// constructor
	public Asteroid()
	{
		//Location of asteroid
		this.setXLoc(800);
		this.setYLoc(800);
		//speed and its initial direction
		this.setObjectDirection(185);
		this.setObjectSpeed(9);
		//Color of PlayerShip
		this.setObjectColor(ColorUtil.GREEN);
	}
	
}