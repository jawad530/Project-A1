package com.mycompany.a1;
import java.util.Random;

public abstract class MovableObject extends GameObject implements IMovable {

	/*
	 * public MovableObject(Point2D location, int color, int speed, int direction)
	 * {
	 * 		super(location, color);
	 * 		...
	 * }
	 */
	
	
	// Randomizer initialization 
	private Random ran = new Random();
	
	// Speed and Direction
	private int objectSpeed = ran.nextInt(15);
	private float objectDirection; // FINISH THIS LINE ********* 
	//ADD DIRECTION HERE
	
	//Setter Methods
	public void setObjectSpeed(int speed) 
	{
		this.objectSpeed = speed;
	}
	
	public void setObjectDirection(float Direction) 
	{
		this.objectDirection = Direction;
	}
	
	//Getter Methods
	public int getObjectSpeed() {
		return objectSpeed;
	}
	
	public float getObjectDirection() {
		return objectDirection;
	}
	
	//movableObject methods
	public void move()
	{
		double PI = Math.PI;
		double direction = this.getObjectDirection();
		double angleCalculation = PI * (90 - direction / 180);
		double currentXLocation = this.getXLoc();
		double currentYLocation = this.getYLoc();
		double deltaX = Math.cos(angleCalculation) * objectSpeed;
		double deltaY = Math.sin(angleCalculation) * objectSpeed;
		this.setXLoc(currentXLocation + deltaX);
		this.setYLoc(currentYLocation + deltaY);
	}
	
	//Custom toString Method
	public String toString() {
		return null; // CHANGE THIS SOON **************
	}
	
}