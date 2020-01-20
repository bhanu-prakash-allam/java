package com.cts.enutraining;

public enum Theater {
	SILVER,
	GOLD,
	PLATINUM;
	
	
	
	public int getCost()
	{
		if(this==SILVER)
		{
			return 100;
		}
		else if(this==GOLD)
		{
			return 300;
		}
		else
			return 250;
	}
}
