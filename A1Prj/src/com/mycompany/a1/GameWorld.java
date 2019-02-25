package com.mycompany.a1;
import java.util.ArrayList;
import java.util.Random;
import com.codename1.charts.util.ColorUtil;


public class GameWorld {
	
	private final static double Xcord = 1024;
	private final static double Ycord = 768;
	
	//for spacecstation tick
	private Random ran = new Random();
	
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
	
	public void addNewNonPlayerShip()
	{
		gameWorldObj.add(new NonPlayerShip());
	}
	
	// add here the one for misse launcher?
	
	// Commands to manipulate the Game
	// work on ship accel then add it here
	
	//Commands for PlayerShip controls
	
	public void increaseAcceleration() 
	{
		if (playerShip instanceof PlayerShip)
		{
			playerShip.accelerationUpdate(1);
		}
		
	}
	
	public void decreaseAcceleration()
	{
		if (playerShip instanceof PlayerShip)
		{
			playerShip.accelerationUpdate(-1);
		}
	}
	
	public void rightTurn()
	{
		if (playerShip instanceof PlayerShip)
		{
			playerShip.directionUpdate(1);
		}
	}
	
	public void leftTurn()
	{
		if (playerShip instanceof PlayerShip)
		{
			playerShip.directionUpdate(-1);
		}
	}
	
	public void jump()
	{
		if (playerShip instanceof PlayerShip)
		{
			playerShip.setXLoc(1024/2);
			playerShip.setYLoc(768/2);
		}
	}
	
	public void newSupply()
	{
		if (playerShip instanceof PlayerShip)
		{
			playerShip.setPlayerShipMissiles(10);
		}
	}
	
	//problem is need to edit missile launcher to be the one firing the missile
	public void fireMissile()
	{
		if (playerShip instanceof PlayerShip)
		{
			int maxMissileCount = playerShip.getCurrentShipMissiles();
			
			if (maxMissileCount > 0)
			{
				gameWorldObj.add(new Missile( playerShip.getXLoc(), playerShip.getYLoc(), playerShip.getObjectDirection() ));
				playerShip.setPlayerShipMissiles(maxMissileCount--);
			}
			else 
				System.out.println("No more Missiles!");
		}
		else 
			System.out.println("Error: Was not able to fire");
	}
	
	public void KilledAsteroid()
	{
		boolean asteroidExist = false;
		boolean missileExist = false; 
		int asteroidHolder = 0;
		int missileHolder = 0;
		int gameWorldScan = gameWorldObj.size();
		
		//check if there exists an asteroid and missile
		for (int i =0; i < gameWorldScan; i++)
		{
			if (gameWorldObj.get(i) instanceof Asteroid)
			{
				asteroidExist = true;
				asteroidHolder = i;
			}
			if (gameWorldObj.get(i) instanceof Missile)
			{
				missileExist = true;
				missileHolder = i;
			}
		}
		if (asteroidExist = true && missileExist == true)
		{
			gameScore = gameScore + 100;
			gameWorldObj.remove(asteroidHolder);
			gameWorldObj.remove(missileHolder);
		}
		else
				System.out.println("Unable to use method Kill");
	}
	
	public void crashed()
	{
		boolean asteroidExist = false;
		boolean shipExist = false; 
		int asteroidHolder = 0;
		int shipHolder = 0;
		int gameWorldScan = gameWorldObj.size();
		
		//check if there exists an asteroid and missile
		for (int i =0; i < gameWorldScan; i++)
		{
			if (gameWorldObj.get(i) instanceof Asteroid)
			{
				asteroidExist = true;
				asteroidHolder = i;
			}
			if (gameWorldObj.get(i) instanceof PlayerShip)
			{
				shipExist = true;
				shipHolder = i;
			}
		}
		if (asteroidExist = true && shipExist == true)
		{
			gameWorldObj.remove(asteroidHolder);
			gameWorldObj.remove(shipHolder);
			playerShip = null;
			lives = lives -1;
			if (lives < 1)
			{
				System.out.println("Game Over");
			}
		}
		else
				System.out.println("Unable to use method Crashed");
	}
	
	public void exterminate()
	{
		boolean asteroid1Exist = false;
		boolean asteroid2Exist = false; 
		int asteroid1Holder = 0;
		int asteroid2Holder = 0;
		int gameWorldScan = gameWorldObj.size();
		
		//check if there exists an asteroid and missile
		for (int i =0; i < gameWorldScan; i++)
		{
			if (gameWorldObj.get(i) instanceof Asteroid)
			{
				asteroid1Exist = true;
				asteroid1Holder = i;
			}
			i++;
			if (gameWorldObj.get(i) instanceof Asteroid)
			{
				asteroid2Exist = true;
				asteroid2Holder = i;
			}
		}
		if (asteroid1Exist = true && asteroid2Exist == true)
		{
			
			gameWorldObj.remove(asteroid1Holder);
			gameWorldObj.remove(asteroid2Holder);
		}
		else
				System.out.println("Unable to use method exterminate");
	}
	
	public void eliminated()
	{
		boolean npsExist = false;
		boolean missileExist = false; 
		int npsHolder = 0;
		int missileHolder = 0;
		int gameWorldScan = gameWorldObj.size();
		
		//check if there exists an asteroid and missile
		for (int i =0; i < gameWorldScan; i++)
		{
			if (gameWorldObj.get(i) instanceof NonPlayerShip)
			{
				npsExist = true;
				npsHolder = i;
			}
			if (gameWorldObj.get(i) instanceof Missile)
			{
				missileExist = true;
				missileHolder = i;
			}
		}
		if (npsExist = true && missileExist == true)
		{
			gameScore = gameScore + 200;
			gameWorldObj.remove(npsHolder);
			gameWorldObj.remove(missileHolder);
		}
		else
				System.out.println("Unable to use method Eliminate");
	}
	
	public void exploded()
	{
		boolean missileExist = false;
		boolean shipExist = false; 
		int missileHolder = 0;
		int shipHolder = 0;
		int gameWorldScan = gameWorldObj.size();
		
		//check if there exists an asteroid and missile
		for (int i =0; i < gameWorldScan; i++)
		{
			if (gameWorldObj.get(i) instanceof Missile)
			{
				missileExist = true;
				missileHolder = i;
			}
			if (gameWorldObj.get(i) instanceof PlayerShip)
			{
				shipExist = true;
				shipHolder = i;
			}
		}
		if (missileExist = true && shipExist == true)
		{
			gameWorldObj.remove(missileHolder);
			gameWorldObj.remove(shipHolder);
			playerShip = null;
			lives = lives -1;
			if (lives < 1)
			{
				System.out.println("Game Over");
			}
		}
		else
				System.out.println("Unable to use method exploded");
	}
	
	public void hit()
	{
		boolean npsExist = false;
		boolean shipExist = false; 
		int npsHolder = 0;
		int shipHolder = 0;
		int gameWorldScan = gameWorldObj.size();
		
		//check if there exists an asteroid and missile
		for (int i =0; i < gameWorldScan; i++)
		{
			if (gameWorldObj.get(i) instanceof NonPlayerShip)
			{
				npsExist = true;
				npsHolder = i;
			}
			if (gameWorldObj.get(i) instanceof PlayerShip)
			{
				shipExist = true;
				shipHolder = i;
			}
		}
		if (npsExist = true && shipExist == true)
		{
			gameWorldObj.remove(npsHolder);
			gameWorldObj.remove(shipHolder);
			playerShip = null;
			lives = lives -1;
			if (lives < 1)
			{
				System.out.println("Game Over");
			}
		}
		else
				System.out.println("Unable to use method hit");
	}
	
	public void impacted()
	{
		boolean asteroidExist = false;
		boolean npsExist = false; 
		int asteroidHolder = 0;
		int npsHolder = 0;
		int gameWorldScan = gameWorldObj.size();
		
		//check if there exists an asteroid and missile
		for (int i =0; i < gameWorldScan; i++)
		{
			if (gameWorldObj.get(i) instanceof Asteroid)
			{
				asteroidExist = true;
				asteroidHolder = i;
			}
			if (gameWorldObj.get(i) instanceof NonPlayerShip)
			{
				npsExist = true;
				npsHolder = i;
			}
		}
		if (asteroidExist = true && npsExist == true)
		{
			gameWorldObj.remove(asteroidHolder);
			gameWorldObj.remove(npsHolder);
			playerShip = null;
			
		}
		else
				System.out.println("Unable to use method impacted");
	}
	
	public void tick()
	{
		int gameWorldArray = gameWorldObj.size();
		
		for(int k = gameWorldArray -1; k >=0; k--)
		{
			if(gameWorldObj.get(k) instanceof IMovable)
			{
				IMovable updatePositions = (IMovable)gameWorldObj.get(k);
				updatePositions.move();
			}
			
			if(gameWorldObj.get(k) instanceof Missile)
			{
				Missile decrementFuel = (Missile)gameWorldObj.get(k);
				int fuel = decrementFuel.getMissileFuel();
				decrementFuel.setMissileFuel(fuel - 1);
				if (fuel < 1)
					gameWorldObj.remove(k);
			}
			if(gameWorldObj.get(k) instanceof SpaceStation)
			{
				SpaceStation station = (SpaceStation)gameWorldObj.get(k);
				if((gameTimer + 1) % station.getBlinkRate() != 0)
				{
					if(station.turnBlinkOn())
					{
						station.blink(false);
					}
					else
					{
						station.blink(true);
					}
				}
			}
			else
				System.out.println("Error, Cant use tick");
		}
	}
	
	public void print()
	{
		System.out.println("test");
	}
	
	
}