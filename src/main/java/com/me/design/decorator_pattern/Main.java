package com.me.design.decorator_pattern;

import com.me.design.decorator_pattern.component.Coffee;
import com.me.design.decorator_pattern.component.Decaf;
import com.me.design.decorator_pattern.decorator.Milk;
import com.me.design.decorator_pattern.decorator.Mocha;

/**
 * @author sondv
 */
public class Main
{
	public static void main(String[] args)
	{
		// Order coffee
		Beverage coffee = new Coffee();
		System.out.println(coffee.getDescription() + " - " + coffee.cost());

		// Order decaf with milk and mocha
		Beverage decaf = new Decaf();
		decaf = new Milk(decaf);
		decaf = new Mocha(decaf);
		System.out.println(decaf.getDescription() + " - " + decaf.cost());
	}
}
