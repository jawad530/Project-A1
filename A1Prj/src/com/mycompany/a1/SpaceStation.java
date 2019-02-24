package com.mycompany.a1;
import java.util.Random;
import com.codename1.charts.util.ColorUtil;

public class SpaceStation extends FixedObject{

	//random numbers needed
	private Random ran = new Random();
	private boolean blink = true;
	private int blinkRate = ran.nextInt(4);
	
	//constructor for SpaceStation
	public SpaceStation()
	{
		this.setXLoc(ran.nextInt(1024));
		this.setYLoc(ran.nextInt(768));
		this.setObjectColor(ColorUtil.GRAY);
	}
	
	//Methods
	
	//setters
	
	public void setBlinkRate(int blinkRate)
	{
		this.blinkRate = blinkRate;
	}
	
	//BLINK NEEDS 2 METHODS
	
	//getters
	public int getBlinkRate()
	{
		return blinkRate;
	}
	
	//toString
	public String toString()
	{
		return null; //ADD CODE LATER
	}
	
}