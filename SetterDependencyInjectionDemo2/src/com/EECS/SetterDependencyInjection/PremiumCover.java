package com.EECS.SetterDependencyInjection;

public class PremiumCover implements Rate{
	private Cover cover;
	
	public void setCover(Cover cover)
	{
		this.cover = cover;
	}
	
	@Override
	public double getRate()
	{
		return 0.8;
	}
}

class Cover
{
	//implementation of cover class
}
