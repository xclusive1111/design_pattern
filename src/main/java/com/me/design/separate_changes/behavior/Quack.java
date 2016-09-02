package com.me.design.separate_changes.behavior;

import com.me.design.separate_changes.QuackBehavior;

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
