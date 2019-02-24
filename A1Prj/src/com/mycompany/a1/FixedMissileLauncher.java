package com.mycompany.a1;

public class FixedMissileLauncher extends MissileLauncher  
{
	
	//try to get nonplayerships direction into here cause has to be same

	//create nonPlayerShip
	public FixedMissileLauncher(NonPlayerShip nps)
	{
		super(nps);
		directionUpdate();
	}
	
	private void directionUpdate()
	{
		super.setObjectDirection(getNPS().getObjectDirection());
	}
	
}
