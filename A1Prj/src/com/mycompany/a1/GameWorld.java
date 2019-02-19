package com.mycompany.a1;
import java.util.ArrayList;

public class GameWorld {
	
	private final static double Xcord = 1024;
	private final static double Ycord = 768;
	
	// Initializing GameWorld
	private int gameScore = 0;
	private int lives = 3;
	private int gameTimer = 0;
	
	//Hold GameWorld in an ArrayList
	private ArrayList<GameObject> gameWorldObj = new ArrayList<GameObject>();
	private PlayerShip playerShip;
	
	//Constructor for Ship controlled by the player
	public void newPlayerShip()
	{
		playerShip = new PlayerShip(Xcord, Ycord);
	}
	
	public void init() {
		newPlayerShip();
		gameWorldObj.add(playerShip);
	}
	
	//Setters
	public void setGameScore(int gameScore)
	{
		this.gameScore = gameScore;
	}
	
	public int getGameScore() 
	{
		return gameScore;
	}
	
	public double getYcord() 
	{
		return Ycord;
	}
	
	public double getXcord() 
	{
		return Xcord;
	}
	
	// Commands to initiate objects in GameWorld
	public void addNewStation()
	{
		gameWorldObj.add(new SpaceStation());
	}
	
	public void addNewAsteroid()
	{
		gameWorldObj.add(new Asteroid());
	}
	
	// add here the one for misse launcher?
	
	// Commands to manipulate the Game
	// work on ship accel then add it here
	
}