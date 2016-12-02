package com.me.design.decorator_pattern.component;

import com.me.design.decorator_pattern.Beverage;

/**
 * @author sondv
 */
public class Decaf extends Beverage
{
	@Override
	public String getDescription()
	{
		return "Decaf";
	}

	@Override
	public double cost()
	{
		return 0.99;
	}
}
