package com.mycompany.a1;
import java.util.Random;

public abstract class MovableObject extends GameObject implements IMovable {

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
		//Add code here
	}
	
	//Custom toString Method
	public String toString() {
		return null; // CHANGE THIS SOON **************
	}
	
}