package com.me.design.strategy.behavior;

import com.me.design.strategy.FlyBehavior;

/**
 * @author sondv
 */
public class FlyingNoWay implements FlyBehavior
{
	public void fly()
	{
		System.out.println("This duck cannot fly at all!");
	}
}
