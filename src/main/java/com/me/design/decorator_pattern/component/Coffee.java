package com.me.design.decorator_pattern.component;

import com.me.design.decorator_pattern.Beverage;

/**
 * @author sondv
 */
public class Coffee extends Beverage
{
	@Override
	public String getDescription()
	{
		return "Coffee";
	}

	@Override
	public double cost()
	{
		return 1.2;
	}
}
