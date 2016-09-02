package com.me.design.separate_changes.behavior;

import com.me.design.separate_changes.QuackBehavior;

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
