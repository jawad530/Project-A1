package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;

public abstract class GameObject {

	//GameObject Variables
	private double xLocation;
	private double yLocation;
	private int color;
	
	//Setter Methods:
	public void setXLoc(double x) 
	{
		
	}
	
	public void setYLoc(double y) 
	{
		
	}
	
	public void setObjectColor(int color) 
	{
		this.color = color;
	}
	
	
	//Getter Methods:
	public double getXLoc(double x) 
	{
		return xLocation;
	}
	
	public double getYLoc(double y) 
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