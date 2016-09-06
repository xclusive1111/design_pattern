package com.me.design.strategy.behavior;

import com.me.design.strategy.QuackBehavior;

/**
 * @author sondv
 */
public class MuteQuack implements QuackBehavior
{
	public void quack()
	{
		System.out.println("This duck does not make any sound");
	}
}
