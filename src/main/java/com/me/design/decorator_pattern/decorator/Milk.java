package com.me.design.decorator_pattern.decorator;

import com.me.design.decorator_pattern.Beverage;

/**
 * @author sondv
 */
public class Milk extends ComdimentDecorator
{
	Beverage beverage;

	public Milk(Beverage _beverage)
	{
		beverage = _beverage;
	}

	@Override
	public String getDescription()
	{
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost()
	{
		return 0.5 + beverage.cost();
	}
}
