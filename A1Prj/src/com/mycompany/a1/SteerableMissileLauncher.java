package com.mycompany.a1;

public class SteerableMissileLauncher extends MissileLauncher implements ISteerable 
{
	public SteerableMissileLauncher(PlayerShip ship)
	{
		super(ship);
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
	}
	
	public void accelerationUpdate(int accelUpdate)
	{
		
	}
}
