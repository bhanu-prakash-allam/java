package com.cts.enutraining;

public class Cost {

	public static void main(String []args)
	{
		Theater silver=Theater.SILVER;
		Theater platinu=Theater.PLATINUM;
		Theater gold=Theater.GOLD;
		System.out.println("the cost for silver is "+Theater.SILVER.getCost());
		System.out.println("the cost for gold is "+Theater.GOLD.getCost());
		System.out.println("the cost for platinumis "+ Theater.PLATINUM.getCost());
	}

}
