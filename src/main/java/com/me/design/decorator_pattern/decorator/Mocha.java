package com.me.design.decorator_pattern.decorator;

import com.me.design.decorator_pattern.Beverage;

/**
 * @author sondv
 */
public class Mocha extends ComdimentDecorator
{
	Beverage beverage;

	public Mocha(Beverage _beverage)
	{
		beverage = _beverage;
	}

	@Override
	public String getDescription()
	{
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost()
	{
		return 0.22 + beverage.cost();
	}
}
