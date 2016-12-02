package com.me.design.decorator_pattern.decorator;

import com.me.design.decorator_pattern.Beverage;

/**
 * @author sondv
 */
public class Whip extends ComdimentDecorator
{
	Beverage beverage;

	public Whip(Beverage _beverage)
	{
		beverage = _beverage;
	}

	@Override
	public String getDescription()
	{
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost()
	{
		return 0.33 + beverage.cost();
	}
}
