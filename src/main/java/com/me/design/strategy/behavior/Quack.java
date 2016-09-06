package com.me.design.strategy.behavior;

import com.me.design.strategy.QuackBehavior;

/**
 * @author sondv
 */
public class Quack implements QuackBehavior
{
	public void quack()
	{
		System.out.println("This duck really making quack sound");
	}
}
