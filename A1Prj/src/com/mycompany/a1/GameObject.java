package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;

public abstract class GameObject {

	/*
	 * public GameObject(Point2D location, int color)
	 * {
	 * 		//...
	 * }
	 */
	
	//GameObject Variables
	private double xLocation;
	private double yLocation;
	private int color;
	
	//Setter Methods:
	public void setXLoc(double x) 
	{
		this.xLocation = x;
	}
	
	public void setYLoc(double y) 
	{
		this.yLocation = y;
	}
	
	public void setObjectColor(int color) 
	{
		this.color = color;
	}
	
	
	//Getter Methods:
	public double getXLoc() 
	{
		return xLocation;
	}
	
	public double getYLoc() 
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
		double xReturn = Math.round(xLocation*10.0) / 10.0;
		double yReturn = Math.round(yLocation*10.0) / 10.0;
		
		return "Location: " + xReturn + "," + yReturn + "color = " + color;
		//return null;
		//FIX THIS LATER
		//return null; //TO FIX*****************
		
	}
}