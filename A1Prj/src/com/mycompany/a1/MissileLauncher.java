package com.mycompany.a1;

public abstract class MissileLauncher extends MovableObject
{
	
	  private PlayerShip ship;
	  private NonPlayerShip nps;
	  
	  public MissileLauncher(PlayerShip ship)
	  {
	  		super();
	  		this.ship = ship;
	  		double xLocation = ship.getXLoc();
	  		double yLocation = ship.getYLoc();
	  		this.setXLoc(xLocation);
	  		this.setYLoc(yLocation);
	  		
	  }
	  
	  public PlayerShip getPlayerShip()
	  {
		  return ship;
	  }
	  
	  public NonPlayerShip getNPS()
	  {
		  return nps;
	  }
	  
	  public MissileLauncher(NonPlayerShip nps)
	  {
	  		super();
	  		this.nps = nps;
	  		double xLocation = nps.getXLoc();
	  		double yLocation = nps.getYLoc();
	  		this.setXLoc(xLocation);
	  		this.setYLoc(yLocation);
	  		
	  }
	  
	  public Missile fireMissile()
	  {
		  	
		  	return null;
	 		//return new Missile();
	  }
	  
	 
}