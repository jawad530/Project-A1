package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;

public abstract class GameObject {

	// GameObject Variables
	private float xLocation;
	private float yLocation;
	private int color;
	
	//Getter and Setter Methods:
	
	public void setXLoc(float x) 
	{
		
	}
	
	public void setYLoc(float y) 
	{
		
	}
	
	public void setObjectColor(int color) 
	{
		this.color = color;
	}
	
	public float getXLoc(float x) 
	{
		return xLocation;
	}
	
	public float getYLoc(float y) 
	{
		return yLocation;
	}
	
	public int getObjectColor() 
	{
		return color;
	}
	
	//Custom String Method
	public String toString() 
	{
		//FIX THIS LATER
		return null; //TO FIX*****************
	}
}