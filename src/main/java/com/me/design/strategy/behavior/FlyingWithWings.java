package com.me.design.strategy.behavior;

import com.me.design.strategy.FlyBehavior;

/**
 * @author sondv
 */
public class FlyingWithWings implements FlyBehavior
{
	public void fly()
	{
		System.out.println("This is duck which can fly with wings");
	}
}
