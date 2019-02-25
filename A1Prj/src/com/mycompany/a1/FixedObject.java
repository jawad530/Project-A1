package com.mycompany.a1;

public abstract class FixedObject extends GameObject {

	private static int uniqueID = 10;
	private int identifier;
	
	public FixedObject()
	{
		this.identifier = uniqueID;
		uniqueID = uniqueID + 1;
	}
	
	//setters
	public void setIdentity(int identity)
	{
		this.identifier = identity;
	}
	
	public static void setUniqueID(int identity)
	{
		FixedObject.uniqueID = identity;
	}
	
	//getters
	public int getIdentity()
	{
		return identifier;
	}
	
	public static int getUniqueID()
	{
		return uniqueID;
	}
	
	//Custom toString
	public String toString()
	{
		return super.toString() + ", ID=" + identifier;
	}
	
}