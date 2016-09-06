package com.me.design.strategy.behavior;

import com.me.design.strategy.QuackBehavior;

/**
 * @author sondv
 */
public class Speak implements QuackBehavior
{
	public void quack()
	{
		System.out.println("This duck actually can speak");
	}
}
