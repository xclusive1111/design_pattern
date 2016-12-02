package com.me.design.decorator_pattern;

/**
 * @author sondv
 */
public abstract class Beverage
{
	String description = "Unknown beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
