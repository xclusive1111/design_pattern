package com.me.design.decorator_pattern.component;

import com.me.design.decorator_pattern.Beverage;

/**
 * @author sondv
 */
public class HouseBlend extends Beverage
{
	@Override
	public String getDescription()
	{
		return "House Blend";
	}

	@Override
	public double cost()
	{
		return 0.80;
	}
}
